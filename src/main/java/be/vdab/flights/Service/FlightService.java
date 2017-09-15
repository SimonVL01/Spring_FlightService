package be.vdab.flights.Service;

import be.vdab.flights.Repositories.FlightRepository;
import be.vdab.flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Service
public class FlightService {

    public FlightService() {
        System.out.println("FlightService gemaakt.");
    }

    @Autowired
    FlightRepository fr;

    public List<Flight> findAll() {

        System.out.println("FlightService wordt gedelegeerd");
        List<Flight> l = fr.findAll();
        return l;
    }

}
