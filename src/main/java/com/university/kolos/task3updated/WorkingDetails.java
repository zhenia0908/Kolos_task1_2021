package com.university.kolos.task3updated;

public class WorkingDetails {
    private int hours;
    private String typeOfAgreement;

    public WorkingDetails(int hours, String typeOfAgreement) {
        this.hours = hours;
        this.typeOfAgreement = typeOfAgreement;
    }

    public int getHours() {
        return hours;
    }

    public String getTypeOfAgreement() {
        return typeOfAgreement;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setTypeOfAgreement(String typeOfAgreement) {
        this.typeOfAgreement = typeOfAgreement;
    }

    @Override
    public String toString() {
        return "WorkingDetails{" +
                "hours=" + hours +
                ", typeOfAgreement='" + typeOfAgreement + '\'' +
                '}';
    }
}
