package com.company;

import com.company.device.Car;
import com.company.device.Phone;

public class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 3;
    String firstName;
    String lastName;
    Animal pet;
    public Phone mobilePhone;
    public Double cash;
    private Double salary;
    Car[] garage;

    public Human() {
        super("HOMO SAPIENS", 80.0);
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Car getCar(Integer parkingPlaceNumber) {
        return garage[parkingPlaceNumber];
    }

    public void setCar(Car car, Integer parkingPlaceNumber) {
        this.garage[parkingPlaceNumber] = car;
    }

    public Double getGarageValue() {
        Double value = 0.0;
        for (Car car : garage) {
            if (car != null && car.value != null) {
                value += car.value;
            }
        }
        return value;
    }


    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) throws Exception {
        //kod
        this.salary = salary;
    }


    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar)
                return true;
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for (Car car : garage) {
            if (car == null)
                return true;
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == carToRemove)
                garage[i] = null;
        }
    }

    public void addCar(Car newCar) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = newCar;
                return;
            }
        }
    }
}
