package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {

    private int speed;

    public Fiat(){

    }

    public Fiat(int speed) {
        this.speed = speed;

    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 30;

    }

    @Override
    public String toString() {
        return "Fiat{" +
                "speed=" + speed +
                '}';
    }
}
