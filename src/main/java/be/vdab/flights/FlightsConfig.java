package be.vdab.flights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Configuration
public class FlightsConfig {
    @Bean
    public List<String> names() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Janis");
        names.add("Jim");
        return names;
    }

    /*@Bean
    public String myCoolBean() {
        return "Cool Bean";
    }

    @Bean
    public String myOtherBean() {
        return "Other Bean";
    }

    @Bean
    public PassengerService myPassengerService(PassengerRepository pr) {
        return new PassengerService(pr);
    }

    @Bean
    public PassengerRepository myPassengerRepository() {
        return new PassengerRepository();
    }*/

}
