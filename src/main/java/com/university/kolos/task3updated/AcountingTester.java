package com.university.kolos.task3updated;

public class AcountingTester {
    public static void main(String[] args) {
        AcountingTester tester = new AcountingTester();
        AccountingManager am = new AccountingManager();
        WorkingDetails wd= new WorkingDetails(9, "full");
        WorkingDetails wd2= new WorkingDetails(6, "full");
        Employee e = new Employee("Masha", "Petrova", 345.6, wd );
        Employee e2 = new Employee("Masha", "Petrova", 345.6, wd2 );
        System.out.println(am.сountBonus(e2));
       System.out.println( am.сountBonus(e));

    }
}
