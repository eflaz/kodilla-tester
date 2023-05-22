package com.kodilla.abstracts.homework.homework2;

public class PersonalAssistant extends Job{
    public PersonalAssistant(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }

    @Override
    public int getSalary() {
        return salary;


    }
}
