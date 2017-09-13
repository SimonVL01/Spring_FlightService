package be.vdab.flights.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Flight flight;

    @Column(nullable = false)
    private double price;

    public Ticket(double price, Passenger passenger, Flight flight) {
        this.price = price;
        this.passenger = passenger;
        this.flight = flight;
    }

    public Ticket() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
        passenger.addTicket(this);
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
