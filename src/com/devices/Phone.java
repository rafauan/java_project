package com.devices;

public class Phone extends Device {
    public Phone(String producer, Integer yearOfProduction, String model) {
        super(producer, yearOfProduction, model);
    }

    public String toString() {
        return "";
    }

    @Override
    public String turnOn() {
        return "Działa";
    }
}
