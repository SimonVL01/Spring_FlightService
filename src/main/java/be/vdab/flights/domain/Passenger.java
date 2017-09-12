package be.vdab.flights.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

public class Passenger {

    @Autowired
    private List<String> passengers;
}
