package com.company;

public class Animal {

    final String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        weight = getWeight();

        if (species.equals("dog")) {
            setWeight(10.0);
        }

        if (species.equals("cat")) {
            setWeight(2.5);
        }

        if (species.equals("elephant")) {
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
}
