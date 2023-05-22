package com.kodilla.abstracts.homework.homework2;

public class Boss extends Job {

    public Boss(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}
