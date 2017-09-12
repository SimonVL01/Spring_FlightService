package be.vdab.flights.Service;

import be.vdab.flights.Repositories.TicketRepository;
import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Service
public class TicketService {

    public TicketService() {
        System.out.println("TicketService gemaakt.");
    }

    @Autowired
    private TicketRepository tr;

    public List<Double> findAll() {

        System.out.println("TicketService wordt gedelegeerd");
        tr.findAll();
        return tr.getTickets();
    }

    public Ticket create(Passenger passenger, double price, Flight flight) {
        return tr.persist(passenger, price, flight);

    }

}
