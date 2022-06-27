package web.controller;

import Sevice.CarServiceImp;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model1", "Colour1", 1));
        cars.add(new Car("Model2", "Colour2", 2));
        cars.add(new Car("Model3", "Colour3", 3));
        cars.add(new Car("Model4", "Colour4", 4));
        cars.add(new Car("Model5", "Colour5", 5));
        if (count > cars.size()) {
            count = cars.size();
        }
        model.addAttribute("cars", new CarServiceImp().numberOfCars(count, cars));
        return "cars";
    }

}