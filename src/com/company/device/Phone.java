package com.company.device;

import java.util.Random;

public class Phone extends Device implements Rechargeable {
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem) {
        super(model, producer, 2021);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk i mogę dzwonić");
    }

    @Override
    public void recharge() {
        System.out.println("podłączam do gniazdka");
    }

    @Override
    public double getChargeLevel() {
        Double level = new Random().nextDouble();
        System.out.println("poziom naładowania: " + level);
        return level;
    }
}
