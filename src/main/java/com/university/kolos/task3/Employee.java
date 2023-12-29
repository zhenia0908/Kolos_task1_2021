package com.university.kolos.task3;

import org.springframework.context.annotation.EnableMBeanExport;

public abstract class Employee {
    private String name;
    private String surname;
    public  abstract int salary();
    public Employee(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void result(){} //????


}
