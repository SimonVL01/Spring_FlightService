package be.vdab.flights.Reservation;

import be.vdab.flights.Repositories.TicketRepository;
import be.vdab.flights.Service.FlightService;
import be.vdab.flights.Service.PassengerService;
import be.vdab.flights.Service.TicketService;
import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Component
public class ReservationService {

    public ReservationService() {
        System.out.println("ReservationService gemaakt.");
    }

    @Autowired
    FlightService flight;

    @Autowired
    PassengerService passenger;

    @Autowired
    TicketService ticket;

    public Ticket bookTicketForFlight(Passenger passenger, Flight flight) {
        System.out.println("Ticket is booked.");

        return ticket.create(passenger, 50.0d, flight);
    }
}
