package be.vdab.flights.Service;

import be.vdab.flights.Repositories.FlightRepository;
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

    public List<Long> findAll() {

        System.out.println("FlightService wordt gedelegeerd");
        fr.findAll();
        return fr.getFlights();
    }

}
