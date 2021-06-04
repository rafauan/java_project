package com.devices;

public class LPG extends Car {
    public LPG(String producer, Integer yearOfProduction, String model, String color, Double value) {
        super(producer, yearOfProduction, model, color, value);
    }

    @Override
    public void refuel() {

    }
}
