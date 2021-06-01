package com.company;
import com.devices.Car;

public class Main {

    public static void main(String[] args) {

        Human John = new Human();

        Animal dog = new Animal("dog");

	    Car car = new Car("Cayenne", "Porsche", "Red", 2009, 35000.0);
        Car car2 = new Car("Cayenne", "Porsche", "Red", 2009, 35000.0);

        John.pet = dog;

        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car.hashCode() == car2.hashCode());

        System.out.println(car.toString());
        System.out.println(car2.toString());

        System.out.println(dog.toString());
        System.out.println(John.toString());

    }
}
