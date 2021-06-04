package com.devices;

import com.company.Human;

public class Phone<serverAddress, protocol, version> extends Device implements Human.salleable {
    final static String serverAddress = "https://test.net";
    final static String protocol = "3333";
    final static Double version = 1.0;

    public Phone(String producer, Integer yearOfProduction, String model) {
        super(producer, yearOfProduction, model);
    }

    public String toString() {
        return "";
    }

    @Override
    public String turnOn() {
        return "Działa";
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(buyer.cash < price) {
            System.out.println("Kupujący nie ma wystarczająco pieniędzy!");
        } else if(seller.phone == null) {
            System.out.println("Sprzedający " + buyer.firstName + " nie ma posiada żadnego telefonu!");
        } else {
            buyer.phone = seller.phone;
            seller.phone = null;
            seller.cash += price;
            buyer.cash -= price;
            System.out.println("Użytkownik " + seller.firstName + " sprzedał telefon użytkownikowi " + buyer.firstName);
            System.out.println("Cena telefonu " + price + " zł");
            System.out.println("Stan konta kupującego: " + buyer.cash + " zł");
            System.out.println("Stan konta sprzedającego: " + seller.cash + " zł");
            System.out.println("Sprzedany telefon to: " + buyer.phone.model);
        }
    }

    public String installAnnApp(String appName) {
        return appName;
    }

    public String installAnnApp(String appName, String appVersion) {
        return appVersion;
    }

    public String installAnnApp(String appName, String appVersion, String serverAddress) {
        return serverAddress;
    }

    public URL installAnnApp(URL app) {
        return app;
    }





}
