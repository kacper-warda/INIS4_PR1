package com.company.device;

public abstract class Device {

    public final String model;
    public final String producer;
    public final Integer yearOfProduction;
    public Double value;

    public Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    abstract public void turnOn();


}
