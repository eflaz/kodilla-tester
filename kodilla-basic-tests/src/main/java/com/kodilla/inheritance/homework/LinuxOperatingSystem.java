package com.kodilla.inheritance.homework;

public class LinuxOperatingSystem extends OperatingSystem {
    public LinuxOperatingSystem(int year) {
        super(year);
    }

    @Override
    public void turnOff() {
        System.out.println("Linux Operating System is OFF!");
    }
}
