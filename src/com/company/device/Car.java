package com.company.device;

import com.company.Human;

public abstract class Car extends Device implements Rechargeable {
    public String color;
    public Double millage;
    public Double engineVolume;

    public static final Double DEFAULT_REFUEL_VOLUME = 10.0;
    public static final Double TANK_VOLUME = 50.0;
    private Double fuelLevel = 20.0;

    public Car(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("przekręcam kluczyk i jadę");
    }

    public abstract void refuel();


    @Override
    public void recharge() {
        System.out.println("no trzeba zatankować");
        this.recharge(true);
    }

    public void recharge(Boolean tankFull) {
        if (tankFull) {
            System.out.println("tankuję do pełna");
            Double fuelVolume = TANK_VOLUME - this.fuelLevel;
            this.recharge(fuelVolume);
        } else {
            this.recharge(DEFAULT_REFUEL_VOLUME);
        }
    }

    public void recharge(Double fuelVolume) {
        System.out.println("będę tankować " + fuelVolume + " litrów paliwa");
        this.recharge(fuelVolume, 95);
    }

    public void recharge(Double fuelVolume, Integer octanNumber) {
        //logika ostateczna
        System.out.println("podjeżdżam na stacje i leję paliwo");
        System.out.println("tankuję " + fuelVolume + " litrów benzyny " + octanNumber);
        this.fuelLevel += fuelVolume;
    }

    @Override
    public double getChargeLevel() {
        return 0.1;
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this))
            throw new Exception("sprzedawca nie ma auta");

        if (!buyer.hasFreeParkingLot())
            throw new Exception("kupujący nie ma miejsca");

        if (buyer.cash < price)
            throw new Exception("kupujący nie ma kasy");

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash += price;
        System.out.println("sprzedano");
    }

}
