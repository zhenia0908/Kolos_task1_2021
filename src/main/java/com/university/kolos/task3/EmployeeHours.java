package com.university.kolos.task3;

public class EmployeeHours extends Employee{
    private int normalSalary;
    private int bonus;
    public EmployeeHours(String name, String surname, int normalSalary, int bonus){
        super( name, surname);
        this.normalSalary = normalSalary;
        this.bonus = bonus;
    }

    public int getNormalSalary() {
        return normalSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setNormalSalary(int normalSalary) {
        this.normalSalary = normalSalary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "EmployeeHours{" +
                "normalSalary=" + normalSalary +
                ", bonus=" + bonus +
                '}';
    }

    public int salary(){
        return  normalSalary + (normalSalary*(bonus/100));
    }
}
