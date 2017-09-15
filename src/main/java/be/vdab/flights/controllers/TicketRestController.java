package be.vdab.flights.controllers;

import be.vdab.flights.Repositories.TicketRepository;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vdabcursist on 15/09/2017.
 */

@RestController
public class TicketRestController {

    @Autowired
    TicketRepository tr;

    @RequestMapping(method = RequestMethod.GET, path = "api/tickets/all", produces = "application/json")
    public List<Ticket> allTickets() {
        return tr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "api/ticket/{tid}", produces = "application/json")
    public Ticket getById(@PathVariable("tid")long id) {
        return tr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "api/ticket/{tid}")
    public void deleteById(@PathVariable("tid") long id) {
        tr.delete(id);
    }

}
