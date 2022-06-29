package Service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private final List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Model1", "Colour1", 1),
            new Car("Model2", "Colour2", 2),
            new Car("Model3", "Colour3", 3),
            new Car("Model4", "Colour4", 4),
            new Car("Model5", "Colour5", 5)));


    @Override
    public List<Car> numberOfCars(int number) {

        if (number > cars.size() || number <= 0) {
            number = cars.size();
        }

        return cars.subList(0, number);
    }
}
