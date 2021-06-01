package com.company;

public class Main {

    public static void main(String[] args) {
	    Human John = new Human();
	    Car car = new Car("Cayenne", "Porsche", "Red", 2009, 35000.0);
        John.setSalary(1000.0);
        John.setCar(car);
    }
}
