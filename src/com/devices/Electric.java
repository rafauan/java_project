package com.devices;

public class Electric extends Car {
    public Electric(String producer, Integer yearOfProduction, String model, String color, Double value) {
        super(producer, yearOfProduction, model, color, value);
    }

    @Override
    public void refuel() {

    }
}
