package com.university.kolos2022.task2;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    public Student(String surname, String name){
        this.surname = surname;
        this.name = name;
    }
    public int compareTo(Student o){
        return this.getSurname().compareTo(o.getSurname());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //смотрим равны ли ссылки
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//если объект пустой, а второй нет или они из разных классов, то не равны

        Student student = (Student) o;//приводит к типу данных Student

        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(surname, student.surname);
    }

}
