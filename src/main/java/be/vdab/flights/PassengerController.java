package be.vdab.flights;

import be.vdab.flights.Service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Component
public class PassengerController {

    @Autowired
    private PassengerService ps;
}
