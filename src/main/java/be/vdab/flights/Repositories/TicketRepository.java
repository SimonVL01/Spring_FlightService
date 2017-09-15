package be.vdab.flights.Repositories;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

//@Repository
//@Transactional
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByPriceIsGreaterThanOrderByPrice(double bound);

    int countByPriceIsGreaterThanOrderByPrice(double bound);

    int countTicketByPassengerEquals(Passenger passenger);

    @Query(value = "SELECT COUNT(t) FROM Ticket t WHERE t.passenger = :p")
    public int countTicketsPerPassenger(@Param("p") String passenger);

    Ticket findByPrice(double price);

    //@Query("INSERT INTO ticket(id, price, flight_id, passenger_id) values(:i, :p, :fl, :pa)")
    //public Ticket addFullTicket(@Param("pa") Passenger passengerId, @Param("p") double price, @Param("fl") Flight flightId);

}

//@Query("select s from Spitters where s.email like '%gmail.com'")
//List<Spitter> findAllGmailSpitters();

    /*@PersistenceContext
    private EntityManager em;

    private Ticket ticket;

    private double price;

    public TicketRepository() {
        System.out.println("TicketRepository wordt aangemaakt");
    }

    private List<Double> tickets;

    public List<Double> findAll() {
        List<Double> tickets = new ArrayList<>();
        tickets.add(75.0d);
        tickets.add(77.0d);
        tickets.add(81.0d);
        tickets.add(85.0d);
        tickets.add(89.0d);
        return tickets;
    }

    public List<Double> getTickets() {
        return tickets;
    }

    public void setTickets(List<Double> tickets) {
        this.tickets = tickets;
    }

    public void readByPrice(double price) {
        this.price = price;
    }

    public Ticket persist(Passenger passenger, double price, Flight flight) {
        return null;
    }

    public Ticket readById(long id) {
        return em.find(Ticket.class, id);
    }

    public void deleteById(long id) {
        Ticket t = em.getReference(Ticket.class, id);
        em.remove(t);
    }

    public void update(Ticket t) {
        em.merge(t);
    }

    public void save(Ticket t) {
        em.persist(t);
    }*/