package com.university.kolos.task3;

public class Tester {
    public static void main(String[] args) {
        EmployeeHours worker1 = new EmployeeHours("Masha ", "Ivanova ", 5768, 20);
        EmployeeOnAgreement worker2 = new EmployeeOnAgreement("Sasha ", "Petrova ", 45, 1.5);
        worker1.salary();
        worker2.salary();
    }
}
