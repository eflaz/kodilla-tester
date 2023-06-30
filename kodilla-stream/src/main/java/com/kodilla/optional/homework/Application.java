package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Adam Nowak", null));
        students.add(new Student("Andrzej Kwiatkowski", new Teacher("Karol Malinowski")));
        students.add(new Student("Karol Baranowski", null));


        for (Student student : students ) {
            System.out.println("uczeń: " + student.getName() + ", " + "nauczyciel: " + Optional.ofNullable(student.getTeacher()).orElse(new Teacher("undefined")).getName());
        }

    }
}
