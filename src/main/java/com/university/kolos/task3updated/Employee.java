package com.university.kolos.task3updated;

public class Employee {
        private String name;
        private String surname;
        private double salary;
        private WorkingDetails workingDetails;
        public Employee(String name, String surname, double salary, WorkingDetails workingDetails){

            this.name = name;
            this.surname = surname;
            this.salary = salary;
            this.workingDetails = workingDetails;
        }
        public String getName(){
            return name;
        }

    public WorkingDetails getWorkingDetails() {
        return workingDetails;
    }

    public void setWorkingDetails(WorkingDetails workingDetails) {
        this.workingDetails = workingDetails;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
                ", salary=" + salary +
                ", workingDetails=" + workingDetails +
                '}';
    }
}







