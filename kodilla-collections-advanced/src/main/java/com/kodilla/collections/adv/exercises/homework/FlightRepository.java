package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        Flight flight = new Flight("Warsaw", "London");
        Flight flight1 = new Flight("Warsaw", "Paris");
        Flight flight2 = new Flight("Warsaw", "Berlin");
        Flight flight3 = new Flight("Paris", "Berlin");
        flights.add(flight);
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        return flights;

    };

}
