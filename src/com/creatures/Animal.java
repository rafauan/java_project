package com.creatures;
import com.company.Human;

public abstract class Animal extends FarmAnimal implements Human.salleable {

    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        weight = getWeight();

        if (species.equals("pies")) {
            setWeight(10.0);
        }

        if (species.equals("kot")) {
            setWeight(2.5);
        }

        if (species.equals("słoń")) {
            setWeight(104.00);
        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void feed() {
        if (weight.equals(0.0)) {
            System.out.println("Twój zwierzak nie żyje! Jak możesz nakarmić trupa?");
        } else {
            weight = getWeight();
            weight += 1;
        }
    }

    public void takeForAWalk() {
        if (weight.equals(0.0)) {
            System.out.println("Twój zwierzak nie żyje! Jak możesz wyjść na spacer z trupem?");
        } else {
            weight = getWeight();
            weight -= 1;
        }
    }

    public String toString() {
        return species + " " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash < price) {
            System.out.println("Kupujący " + buyer.firstName + " nie ma wystarczająco pieniędzy!");
        } else if(seller.pet == null) {
            System.out.println("Sprzedający " + buyer.firstName + " nie ma posiada żadnego zwierzaka!");
        } else {
            buyer.pet = seller.pet;
            seller.pet = null;
            seller.cash += price;
            buyer.cash -= price;
            System.out.println("Użytkownik " + seller.firstName + " sprzedał zwierzaka użytkownikowi " + buyer.firstName);
            System.out.println("Cena zwierzaka " + price + " zł");
            System.out.println("Stan konta kupującego: " + buyer.cash + " zł");
            System.out.println("Stan konta sprzedającego: " + seller.cash + " zł");
            System.out.println("Sprzedany zwierzak to: " + buyer.pet.species);
        }
    }

    public interface Feedable {
        void feed();
        void feed(Double foodWeight);
    }
}
