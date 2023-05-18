package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }
    public void turnOn() {
        System.out.println("Operating system is on. Production year is: " + year);
    };

    public void turnOff() {
        System.out.println("Operating system is off. Production year is: " + year);
    }




}
