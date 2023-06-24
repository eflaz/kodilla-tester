package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> schools = new HashMap<>();
        School first = new School(Arrays.asList(23, 31, 25), "HighSchool");
        School second = new School(Arrays.asList(21, 26, 28), "MusicSchool");

        Principal johnKowalski = new Principal("John", "Kowalski");
        Principal adamNowak = new Principal("Adam", "Nowak");

        schools.put(first, johnKowalski);
        schools.put(second, adamNowak);



        for (Map.Entry<School, Principal> schoolEntry : schools.entrySet()) {
            System.out.println(schoolEntry.getValue().getFirstname() + " " + schoolEntry.getValue().getLastname() +
            " " + schoolEntry.getKey().getName() + " " + schoolEntry.getKey().getSum());
            System.out.println();
        }



    }
}
