package be.vdab.flights.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Entity
public class Passenger {

    /*@Autowired
    private List<String> passengers;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;
    private String lastname;
    private int frequentFlyerrMiles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getFrequentFlyerrMiles() {
        return frequentFlyerrMiles;
    }

    public void setFrequentFlyerrMiles(int frequentFlyerrMiles) {
        this.frequentFlyerrMiles = frequentFlyerrMiles;
    }
}
