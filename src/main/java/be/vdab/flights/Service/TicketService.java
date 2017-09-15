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

    public TicketService(TicketRepository tr) {
        this.tr = tr;
    }

    public TicketService() {
        System.out.println("TicketService gemaakt.");
    }

    @Autowired
    private TicketRepository tr;

    public List<Ticket> findAll() {

        System.out.println("TicketService wordt gedelegeerd");
        List <Ticket> t = tr.findAll();
        return t;
    }

    /*public Ticket create(Passenger passenger, double price, Flight flight) {
        return tr.addFullTicket(passenger, price, flight);

    }*/

}
