package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private int a;


    public Square(int a) {
        this.a = a;
    }

    @Override
    public double givePerimeter() {
        return 4*a;

    }

    @Override
    public double giveArea() {
        return a*a;

    }
}
