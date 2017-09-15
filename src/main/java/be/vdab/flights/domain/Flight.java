package be.vdab.flights.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String destination;

    @Column(nullable=false)
    private String departure;

    @Column(unique = true, nullable = false)
    private String number;

    public Flight(String destination, String departure, String number) {
        this.destination = destination;
        this.departure = departure;
        this.number = number;
    }

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Flight: " +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", number='" + number + '\'';
    }
}
