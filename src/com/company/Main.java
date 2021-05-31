package com.company;

public class Main {

    public static void main(String[] args) {
	    Human John = new Human();
	    John.pet = new Animal("elephant");
	    John.car = new Car("Cayenne", "Porsche", "Red", 2009);

        John.pet.feed();
	    John.pet.takeForAWalk();

        for (int i = 0; i <= 10; i++) {
            John.pet.feed();
        }

        for (int i = 0; i <= 10; i++) {
            John.pet.takeForAWalk();
        }

        System.out.println(John.car.model);

    }
}
