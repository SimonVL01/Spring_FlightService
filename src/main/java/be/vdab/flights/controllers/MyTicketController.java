package be.vdab.flights.controllers;

import be.vdab.flights.Repositories.TicketRepository;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by vdabcursist on 14/09/2017.
 */

@Controller
public class MyTicketController {

    @Autowired
    TicketRepository tr;

    @RequestMapping("myTicketList.html")
    public String myFlightTickets(Map<String, Object> model) {

        List<Ticket> ticketList = tr.findAll();
        model.put("flightTickets", ticketList);

        //Todo
        return "myTicketList";
    }

}