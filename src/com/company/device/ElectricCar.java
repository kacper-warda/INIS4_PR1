package com.company.device;

public class ElectricCar extends Car {

    public ElectricCar(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("ładuję auto z gniazdka");
    }
}
