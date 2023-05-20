package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    int r;
    static final double PI = 3.1415927;

    public Circle(int r, double PI) {
        this.r = r;
    }

    @Override
    public double givePerimeter() {
        return 2*PI*r;
    }

    @Override
    public double giveArea() {
        return PI*r*r;
    }
}
