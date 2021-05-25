package com.company;

import com.company.device.Car;
import com.company.device.ElectricCar;
import com.company.device.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("Felis", 2.0);

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        me.pet = new Animal("Canis", 13.0);

        Car passat = new ElectricCar("Passat", "VW", 1999);
        passat.color = "gray";
        passat.millage = 80000.0;
        passat.engineVolume = 1.9;

//        passat.turnOn();
//        passat.recharge();

        Phone samsung = new Phone("samsung", "galaxy 1", 4.0, "Android");
        me.mobilePhone = samsung;
        me.cash = 1000.0;
        Human brotherInLow = new Human();
        brotherInLow.cash = 1000.0;

//        List<String> appNames = new ArrayList<>();
//        appNames.add("messenger");
//        appNames.add("signal");
//        appNames.add("angry birds");
//        appNames.add("pokemongo");
//
//        samsung.installAnApp(appNames);
//
//        samsung.installAnApp(new String[]{"trip advisor", "uber", "booksy"});

        String text = me.toString();
        System.out.println(text);

    }
}
