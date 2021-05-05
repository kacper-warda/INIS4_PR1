package com.company.device;

public class Car extends Device implements Rechargeable {
    public String color;
    public Double millage;
    public Double engineVolume;

    public Car(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("przekręcam kluczyk i jadę");
    }

    @Override
    public void recharge() {
        System.out.println("podjeżdżam na stacje i leję paliwo");
    }

    @Override
    public double getChargeLevel() {
        return 0.1;
    }

}
