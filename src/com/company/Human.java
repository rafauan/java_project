package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Human {
    Animal pet;
    private Car car;
    private Double salary;
    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date salaryDate = new Date();
    String lastSalaryDate = dateFormatter.format(salaryDate);
    ArrayList<String> salaryGettersList = new ArrayList<String>();

    public void setSalary(Double salary){
        if(salary < 0.0) {
            System.out.println("Nie można przypisać ujemnej wartości do pensji.");
        } else {
            this.salary = salary;
            System.out.println("\nNowe dane zostały wysłane do systemu księgowego \nProszę pamiętać o odebraniu aneksu do umowy od pani Hani z kadr \nZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }
    }

    public Double getSalary(){
        salaryGettersList.add(lastSalaryDate);
        String salaryString = String.valueOf(salary);
        salaryGettersList.add(salaryString);

        String dateInConsole;
        String salaryInConsole;

        if(salaryGettersList.size() > 4) {
            dateInConsole = salaryGettersList.get(salaryGettersList.size() - 4);
            salaryInConsole = salaryGettersList.get(salaryGettersList.size() - 3);
        } else {
            dateInConsole = lastSalaryDate;
            salaryInConsole = String.valueOf(salary);
        }

        System.out.println("Data ostatniego przeglądu stanu konta: " + dateInConsole);
        System.out.println("Ostatni stan konta: " + salaryInConsole);
        return salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        Double salaryNow = getSalary();

        if(salaryNow > car.value) {
            System.out.println("Udało Ci się kupić samochód za gotówkę!");
            this.car = car;
        } else if(salaryNow > car.value / 12) {
            System.out.println("Udało Ci się kupić samochód na kredyt (no trudno).");
            this.car = car;
        } else {
            System.out.println("Nie masz wystarczająco środków na kupno tego samochodu, zapisz się na studia, znajdź nową robotę albo idź po podwyżkę.");
        }
    }
}
