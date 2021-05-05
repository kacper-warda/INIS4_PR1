package com.company;

import com.company.device.Car;
import com.company.device.Phone;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone mobilePhone;
    Car car;
    private Double salary;

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) throws Exception {
        //kod
        this.salary = salary;
    }
}
