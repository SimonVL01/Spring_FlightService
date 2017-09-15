package be.vdab.flights.controllers;

import be.vdab.flights.Repositories.FlightRepository;
import be.vdab.flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vdabcursist on 15/09/2017.
 */

@RestController
public class FlightRestController {

    @Autowired
    FlightRepository fr;

    @RequestMapping(method = RequestMethod.GET, path = "api/flight/all", produces = "application/json")
    public List<Flight> findAll() {
        return fr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "api/flight/{fid}", produces = "application/json")
    public Flight findById(@PathVariable("fid") long id) {
        return fr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "api/flight/{fid}")
    public void deletePassenger(@PathVariable("fid") long id) {
        fr.delete(id);
    }
}
