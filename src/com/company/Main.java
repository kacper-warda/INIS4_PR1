package com.company;

import com.company.device.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("Felis", 2.0);

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        me.pet = new Animal("Canis", 13.0);

        Car passat = new Car("Passat", "VW", 1999);
        passat.color = "gray";
        passat.millage = 80000.0;
        passat.engineVolume = 1.9;

        passat.turnOn();


    }
}
