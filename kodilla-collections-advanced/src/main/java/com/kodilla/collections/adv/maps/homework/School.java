package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();
    private String name;

    public School(List<Integer> students, String name) {
        this.students = students;
        this.name = name;
    }

    public List<Integer> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

   public int getSum() {
        int sum = 0;
        for (int students : students)
            sum += students;
        return sum;
   }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", name='" + name + '\'' +
                '}';
    }
}
