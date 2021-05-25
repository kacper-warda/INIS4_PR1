package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;
    protected String name;
    File pic;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    void feed() {
        System.out.println("thx for food");
        this.weight += 1; // to samo co this.weight = this.weight + 1
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }
}
