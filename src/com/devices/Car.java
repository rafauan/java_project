package com.devices;

public class Car {
    public final String model;
    public final String producer;
    public final String color;
    public final Integer yearOfProduction;
    public Double value;

    public Car(String model, String producer, String color, Integer yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
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
}

