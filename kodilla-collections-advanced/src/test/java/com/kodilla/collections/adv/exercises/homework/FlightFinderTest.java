package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void findFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "London"));
        expectedList.add(new Flight("Warsaw", "Paris" ));
        expectedList.add(new Flight("Warsaw", "Berlin"));

        assertEquals(expectedList, result);


    }

    @Test
    void findFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Berlin"));
        expectedList.add(new Flight("Paris", "Berlin"));
        assertEquals(expectedList, result);
    }
}