package com.company;

public class Main {

    public static void main(String[] args) {
	    Human John = new Human();
	    John.pet = new Animal("elephant");
	    John.car = new Car("Cayenne", "Porsche", "Red", 2009);

//        John.pet.feed();
//	    John.pet.takeForAWalk();
//
//	    John.getSalary();
//
//        for (int i = 0; i <= 10; i++) {
//            John.pet.feed();
//        }
//
//        for (int i = 0; i <= 10; i++) {
//            John.pet.takeForAWalk();
//        }

        John.setSalary(4999.0);
        John.getSalary();
        John.setSalary(5000.0);
        John.getSalary();
        John.setSalary(3500.0);
        John.getSalary();

        System.out.println(John.salaryGettersList);

    }
}
