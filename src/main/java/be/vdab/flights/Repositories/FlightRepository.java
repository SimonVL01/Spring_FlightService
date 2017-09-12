package be.vdab.flights.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository
public class FlightRepository {

    public FlightRepository() {
        System.out.println("FlightRepository wordt aangemaakt");
    }

    private Long id;

    private List<Long> flights;

    public List<Long> findAll() {
        List<Long> flights = new ArrayList<>();
        flights.add(300l);
        flights.add(301l);
        flights.add(302l);
        flights.add(303l);
        flights.add(304l);
        return flights;
    }

    public List<Long> getFlights() {
        return flights;
    }

    public void setFlights(List<Long> flights) {
        this.flights = flights;
    }

    public void readById(Long id) {
        this.id = id;
    }
}
