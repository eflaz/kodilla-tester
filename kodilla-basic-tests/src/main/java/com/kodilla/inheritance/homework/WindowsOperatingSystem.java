package com.kodilla.inheritance.homework;

public class WindowsOperatingSystem extends OperatingSystem {
    public WindowsOperatingSystem(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Windows Operating System is on!");
    }


}
