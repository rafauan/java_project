package com.company;
import com.devices.Car;
import com.devices.Phone;
import com.creatures.Animal;

public class Main {

    public static void main(String[] args) {

        Human John = new Human();
        Human Mark = new Human();

        Phone phone = new Phone("Apple", 2020, "iPhone 12 Pro");

        Car car = new Car("Porsche", 2020, "Cayenne", "Red", 35000.0);
        Car car2 = new Car("Porsche", 2020, "Cayenne", "Red", 35000.0);


        John.phone = phone;
        John.cash = 500.0;
        John.firstName = "John";
        John.carToSell = car2;

        Mark.cash = 3000.0;
        Mark.firstName = "Mark";

        phone.sell(John, Mark, 400.0);
        System.out.println("\n");
        car.sell(John, Mark, 1000.0);
    }
}
