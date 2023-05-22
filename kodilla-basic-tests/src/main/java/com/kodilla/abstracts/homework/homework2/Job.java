package com.kodilla.abstracts.homework.homework2;

public abstract class Job {
    int salary;

    String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
    public abstract int getSalary();
    public abstract String getResponsibilities();

}
