package com.devices;

public class Car extends Device {

    public final String color;
    public Double value;

    public Car(String producer, Integer yearOfProduction, String model, String color, Double value) {
        super(producer, yearOfProduction, model);
        this.color = color;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car otherCar) {
            return model.equals(otherCar.model) &&
                    producer.equals(otherCar.producer) &&
                    color.equals(otherCar.color) &&
                    yearOfProduction.equals(otherCar.yearOfProduction) &&
                    value.equals(otherCar.value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (17 * model.hashCode() + 31 * producer.hashCode() + 7 * yearOfProduction + 14 * value);
    }

    public String toString() {
        return model + " " + producer + " " + color + " " + yearOfProduction + " " + value;
    }

    @Override
    public String turnOn() {
        return "Działa";
    }
}

