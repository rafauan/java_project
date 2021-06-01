package com.devices;

public abstract class Device {
    public final String producer;
    public final Integer yearOfProduction;
    public final String model;

    protected Device(String producer, Integer yearOfProduction, String model) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.model = model;
    }

    public String toString() {
        return producer + " " + yearOfProduction + " " + model;
    }

    public abstract String turnOn();

}
