package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println(square.givePerimeter());
        System.out.println(square.giveArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println(rectangle.givePerimeter());
        System.out.println(rectangle.giveArea());

        Shape circle = new Circle(7, 3.1415927);
        System.out.println(circle.givePerimeter());
        System.out.println(circle.giveArea());

    }
}
