package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {


    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsTable = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (departure.equals(flight.getDeparture())) {
                flightsTable.add(flight);
            }
        }

        return (flightsTable);

    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTable = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (arrival.equals((flight.getArrival()))) {
                flightsTable.add(flight);
            }

        }
        return (flightsTable);
    }

}
