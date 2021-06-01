package com.company;
import com.devices.Car;

public class Main {

    public static void main(String[] args) {

        Human John = new Human();

        Animal dog = new Animal("dog");

        Car car = new Car("Porsche", 2020, "Cayenne", "Red", 35000.0);
        Car car2 = new Car("Porsche", 2020, "Cayenne", "Red", 35000.0);

        John.pet = dog;

        System.out.println(car.equals(car2));
        System.out.println(car);
        System.out.println(car.hashCode() == car2.hashCode());

        System.out.println(car.toString());
        System.out.println(car2.toString());

        System.out.println(dog.toString());
        System.out.println(John.toString());

        System.out.println(car.turnOn());

    }
}
