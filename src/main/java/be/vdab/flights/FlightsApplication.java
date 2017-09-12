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

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		/*ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);
		String s = ac.getBean("myOtherBean", String.class);
		System.out.println(s);
		PassengerService p = ac.getBean("myPassengerService", PassengerService.class);
		System.out.println(p.findAll());
		p.stringify(p.findAll());

		PassengerRepository pR = ac.getBean("myPassengerRepository", PassengerRepository.class);
		System.out.println(pR.findAll());*/

		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);
		FlightService fl = ac.getBean("flightService", FlightService.class);
		PassengerService ps = ac.getBean("passengerService", PassengerService.class);
		TicketService ts = ac.getBean("ticketService", TicketService.class);

		ReservationService rs = ac.getBean("reservationService", ReservationService.class);

		/*FlightRepository fr = ac.getBean("flightRepository", FlightRepository.class);
		PassengerRepository pr = ac.getBean("passengerRepository", PassengerRepository.class);
		TicketRepository tr = ac.getBean("ticketService", TicketRepository.class);

		Flight f = ac.getBean("flight", Flight.class);
		Passenger p = ac.getBean("passenger", Passenger.class);
		Ticket t = ac.getBean("ticket", Ticket.class);*/
	}
}
