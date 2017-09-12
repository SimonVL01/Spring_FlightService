package be.vdab.flights.Repositories;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository
public class PassengerRepository {

    public PassengerRepository() {
        System.out.println("PassengerRepository wordt aangemaakt");
    }

    private List<String> passengers;

    public List<String> findAll() {
        List<String> passengers = new ArrayList<>();
        passengers.add("Jimi");
        passengers.add("Janis");
        passengers.add("Amy");
        passengers.add("Kurt");
        passengers.add("Jim");
        this.passengers = passengers;
        return passengers;
    }

    public List<String> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<String> passengers) {
        this.passengers = passengers;
    }

}
