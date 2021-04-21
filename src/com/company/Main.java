package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("Felis",2.0);

        System.out.println(me.firstName);
        System.out.println(me.pet.name);

        me.pet = new Animal("Canis",13.0);

        //jak dostać się do kota?

    }
}
