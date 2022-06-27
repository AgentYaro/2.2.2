package Sevice;

import model.Car;

import java.util.List;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> numberOfCars(int number,List<Car> listOfCars){
        return listOfCars.subList(0,number);
    }
}
