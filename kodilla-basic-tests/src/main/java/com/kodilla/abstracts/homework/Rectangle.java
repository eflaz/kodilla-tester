package com.kodilla.abstracts.homework;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
       this.a = a;
       this.b = b;
    }
    @Override
    public double givePerimeter() {
        return 2*a + 2*b;
    }

    @Override
    public double giveArea() {
        return a*b;
    }
}
