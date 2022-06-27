package Sevice;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> numberOfCars(int number, List<Car> listOfCars);
}
