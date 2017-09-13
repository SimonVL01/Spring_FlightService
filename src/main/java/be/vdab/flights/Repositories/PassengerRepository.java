package be.vdab.flights.Repositories;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository
@Transactional
public class PassengerRepository {

    @PersistenceContext
    private EntityManager em;

    public PassengerRepository() {
        System.out.println("PassengerRepository wordt aangemaakt");
    }

    private List<String> passengers;

    public List<String> findAll() {
        List<String> passengers = new ArrayList<>();
        passengers.add("Jimi");
        passengers.add("Janis");
        passengers.add("Amy");
        passengers.add("Kurt");
        passengers.add("Jim");
        this.passengers = passengers;
        return passengers;
    }

    public List<String> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<String> passengers) {
        this.passengers = passengers;
    }

    public Passenger readById(long id) {
        System.out.println("Reading passenger by id.");
        return em.find(Passenger.class, id);
    }

    public void deleteById(long id) {
        Passenger p = em.getReference(Passenger.class, id);
        em.remove(p);
    }

    public void update(Passenger p) {
        em.merge(p);
    }

    public void save(Passenger p) {
        em.persist(p);
    }
}
