package com.company;

public class Car {
    final String model;
    final String producer;
    final String color;
    final Integer yearOfProduction;
    Double value;

    public Car(String model, String producer, String color, Integer yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
}
