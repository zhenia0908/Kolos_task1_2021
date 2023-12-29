package com.university.kolos.task3;

public class EmployeeOnAgreement extends Employee {
    private int hoursOfWorking;
    private double basis;

    public EmployeeOnAgreement(String name, String surname, int hoursOfWorking, double basis) {
        super(name, surname);
        this.hoursOfWorking = hoursOfWorking;
        this.basis = basis;
    }

    public int getHoursOfWorking() {
        return hoursOfWorking;
    }

    public double getBasis() {
        return basis;
    }

    public void setHoursOfWorking(int hoursOfWorking) {
        this.hoursOfWorking = hoursOfWorking;
    }

    public void setBasis(float basis) {
        this.basis = basis;
    }

    @Override
    public String toString() {
        return "EmployeeOnAgreement{" +
                "hoursOfWorking=" + hoursOfWorking +
                ", basis=" + basis +
                '}';
    }

    public int salary() {
        return (int) (basis * hoursOfWorking);
    }
}
