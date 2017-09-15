package be.vdab.flights.Repositories;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

public interface FlightRepository extends JpaRepository<Flight, Long> {

    Flight findByNumber(String number);

    Flight findByDepartureAndDestination(String departure, String destination);

    Flight findAllOrderByNumber(String departure, String destination);

    //Flight findByDestinationWhereDestinationLike'%Intl';

    @Query("SELECT f FROM Flight f WHERE Destination LIKE '%Intl'")
    public void destinationSearch();

}

    /*@PersistenceContext
    private EntityManager em;

    public FlightRepository() {
        System.out.println("FlightRepository wordt aangemaakt");
    }

    private Long id;

    private List<Long> flights;

    public List<Long> findAll() {
        List<Long> flights = new ArrayList<>();
        flights.add(300l);
        flights.add(301l);
        flights.add(302l);
        flights.add(303l);
        flights.add(304l);
        return flights;
    }

    public List<Long> getFlights() {
        return flights;
    }

    public void setFlights(List<Long> flights) {
        this.flights = flights;
    }

    public Flight readById(long id) {
        return em.find(Flight.class, id);
    }

    public void deleteById(long id) {
        Flight f = em.getReference(Flight.class, id);
        em.remove(f);
    }

    public void updateById(Flight f) {
        em.merge(f);
    }

    public void save(Flight f) {
        em.persist(f);
    }

    public Flight queryByFlightNumber(String flightNumber) {
        TypedQuery<Flight> query = em.createQuery("select f from Flight f where f.number = :fn", Flight.class);
        query.setParameter("fn", flightNumber);
        return query.getSingleResult();
    }*/