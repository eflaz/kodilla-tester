package com.kodilla.abstracts.homework.homework2;

public class JobApp {
    public static void main(String[] args) {
        Job boss = new Boss (10, "manager");
        Person person = new Person("Jan", 50, boss);
        System.out.println(person.getJob().getSalary());
        System.out.println(person.getJob().getResponsibilities());
        System.out.println(person.firstName);
        System.out.println(person.age);

        Job personalAssistant = new PersonalAssistant(5, "everything");
        Person person1 = new Person("Kasia", 20, personalAssistant);
        System.out.println(person1.getJob().getSalary());
        System.out.println(person1.getJob().getResponsibilities());
        System.out.println(person1.firstName);
        System.out.println(person1.age);

    }
}
