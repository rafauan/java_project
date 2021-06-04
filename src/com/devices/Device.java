package com.devices;

import com.company.Human;
public abstract class Device implements Human.salleable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) { }

}
