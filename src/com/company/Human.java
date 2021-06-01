package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Human {
    Animal pet;
    Car car;
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
            System.out.println("Nowe dane zostały wysłane do systemu księgowego \nProszę pamiętać o odebraniu aneksu do umowy od pani Hani z kadr \nZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        }
    }

    public Double getSalary(){
        salaryGettersList.add(lastSalaryDate);
        String salaryString = String.valueOf(salary);
        salaryGettersList.add(salaryString);

        if(salaryGettersList.size() > 3) {
            System.out.println("Data ostatniego przeglądu stanu konta: " + salaryGettersList.get(salaryGettersList.size() - 4));
            System.out.println("Ostatni stan konta: " + salaryGettersList.get(salaryGettersList.size() - 3));
        } else {
            System.out.println("Data ostatniego przeglądu stanu konta: " + lastSalaryDate);
            System.out.println("Ostatni stan konta: " + salary);
        }

        return salary;
    }
}
