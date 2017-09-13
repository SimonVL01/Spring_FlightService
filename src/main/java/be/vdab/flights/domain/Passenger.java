package be.vdab.flights.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Entity
public class Passenger {

    public Passenger(String firstname, String lastname, int frequentFlyerMiles) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public Passenger() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets = new ArrayList<>();

    private String firstname;

    private String lastname;

    private int frequentFlyerMiles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(int frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
        if(!ticket.getPassenger().equals(this)) {
            ticket.setPassenger(this);
        }
    }
}
