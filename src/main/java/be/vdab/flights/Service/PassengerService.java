package be.vdab.flights.Service;

import be.vdab.flights.Repositories.PassengerRepository;
import be.vdab.flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Service
public class PassengerService {

    public PassengerService() {
        System.out.println("PassengerService gemaakt.");
    }

    @Autowired
    PassengerRepository pr;

    public List<String> findAll() {

        System.out.println("PassengerService wordt gedelegeerd.");
        pr.findAll();
        return pr.getPassengers();
    }

}
