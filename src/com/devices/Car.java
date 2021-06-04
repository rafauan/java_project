package com.devices;

import com.company.Human;

public abstract class Car extends Device implements Human.salleable {

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash < price) {
            System.out.println("Kupujący nie ma wystarczająco pieniędzy!");
        } else {
            buyer.carToSell = seller.carToSell;
            seller.carToSell = null;
            seller.cash += price;
            buyer.cash -= price;
            System.out.println("Użytkownik " + seller.firstName + " sprzedał samochód użytkownikowi " + buyer.firstName);
            System.out.println("Cena samochodu " + price + " zł");
            System.out.println("Stan konta kupującego: " + buyer.cash + " zł");
            System.out.println("Stan konta sprzedającego: " + seller.cash + " zł");
            System.out.println("Sprzedany samochod to: " + buyer.carToSell);
        }
    }

    public abstract void refuel();
}

