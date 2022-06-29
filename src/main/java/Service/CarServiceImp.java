package Service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService{
    @Override
    public List<Car> numberOfCars(int number){
        List<Car>cars =new ArrayList<Car>();
        cars.add(new Car("Model1", "Colour1", 1));
        cars.add(new Car("Model2", "Colour2", 2));
        cars.add(new Car("Model3", "Colour3", 3));
        cars.add(new Car("Model4", "Colour4", 4));
        cars.add(new Car("Model5", "Colour5", 5));
        if (number > cars.size()||number<=0) {
            number = cars.size();
        }
        return cars.subList(0,number);
    }
}
