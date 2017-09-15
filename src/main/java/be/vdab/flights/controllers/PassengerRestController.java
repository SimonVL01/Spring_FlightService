package be.vdab.flights.controllers;

import be.vdab.flights.Repositories.PassengerRepository;
import be.vdab.flights.domain.Passenger;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.List;

/**
 * Created by vdabcursist on 15/09/2017.
 */

@RestController
//@RequestMapping(path = "api/passenger")
public class PassengerRestController {

    @Autowired
    PassengerRepository pr;

    @RequestMapping(method = RequestMethod.GET, path = "api/passenger/all", produces = "application/json")
    public List<Passenger> findAll() {
       return pr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "api/passenger/{pid}", produces = "application/json")
    public Passenger findPassengerById(@PathVariable("pid") long id) {
        return pr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{pid}")
    public void deletePassenger(@PathVariable("pid") long id) {
        Passenger passenger = pr.findOne(id);
        pr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, path="api/passenger", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Passenger> create(@RequestBody Passenger input) {
        if (input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "api/passenger", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Passenger> update(@RequestBody Passenger input) {
        if (input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }

}
