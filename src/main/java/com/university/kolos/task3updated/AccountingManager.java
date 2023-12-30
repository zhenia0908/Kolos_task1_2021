package com.university.kolos.task3updated;

public class AccountingManager {
    public static final int procent = 25;

    //equals сравнивает значения, а == ссылки(если примитивы)
    public Employee сountBonus(Employee e) {
        if (e.getWorkingDetails().getHours() < 8 && e.getWorkingDetails().getTypeOfAgreement().equals("full")) {
            System.out.println("Error");
        } else if (e.getWorkingDetails().getHours() == 8 && e.getWorkingDetails().getTypeOfAgreement().equals("part")) {
            System.out.println("Error");
        } else if (e.getWorkingDetails().getTypeOfAgreement().equals("full")) {
            double newSalary = e.getSalary() + ((e.getSalary() * procent) / 100);
            e.setSalary(newSalary);
        } else {
            double newSalary = e.getSalary() + ((procent * e.getWorkingDetails().getHours()) / 8);
        }
        return e;
    }

}
