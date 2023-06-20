package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("King", 20, "yes"));
        stamps.add(new Stamp("Queen", 10, "no"));
        stamps.add(new Stamp("Winter", 30, "yes"));
        stamps.add(new Stamp("Summer", 45, "no"));
        stamps.add(new Stamp("King", 20, "yes"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
