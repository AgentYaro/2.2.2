package web.controller;

import Service.CarService;
import Service.CarServiceImp;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@ComponentScan("Service")
public class CarController {
@Autowired
CarService carServiceImp;
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
        List<Car> cars = carServiceImp.numberOfCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}