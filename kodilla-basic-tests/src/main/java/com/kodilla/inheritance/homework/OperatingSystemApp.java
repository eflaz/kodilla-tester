package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOff();
        operatingSystem.turnOn();

        WindowsOperatingSystem windowsOperatingSystem = new WindowsOperatingSystem(2022);
        windowsOperatingSystem.turnOn();
        windowsOperatingSystem.turnOff();

        LinuxOperatingSystem linuxOperatingSystem = new LinuxOperatingSystem(2021);
        linuxOperatingSystem.turnOff();
        linuxOperatingSystem.turnOn();
    }
}
