package be.vdab.flights;

import be.vdab.flights.Repositories.FlightRepository;
import be.vdab.flights.Repositories.PassengerRepository;
import be.vdab.flights.Repositories.TicketRepository;
import be.vdab.flights.Reservation.ReservationService;
import be.vdab.flights.Service.FlightService;
import be.vdab.flights.Service.PassengerService;
import be.vdab.flights.Service.TicketService;
import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.persistence.TypedQuery;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);
		FlightService fl = ac.getBean("flightService", FlightService.class);
		PassengerService ps = ac.getBean("passengerService", PassengerService.class);
		TicketService ts = ac.getBean("ticketService", TicketService.class);

		ReservationService rs = ac.getBean("reservationService", ReservationService.class);

		PassengerRepository pr = ac.getBean(PassengerRepository.class);

        List<Passenger> pp = pr.findAllPassengers();

        for (Passenger p : pp) {
            System.out.println("Hello " + p.getFirstname());
        }

		/*Passenger p = new Passenger("Elijah", "Ballard", 50);
		pr.save(p);

		FlightRepository fr = ac.getBean(FlightRepository.class);
		Flight f = new Flight("Italy", "Bxl", "59");
		fr.save(f);

		TicketRepository tr = ac.getBean(TicketRepository.class);
		Ticket t = new Ticket(70.0d, p, f);
		tr.save(t);*/


    }
}
