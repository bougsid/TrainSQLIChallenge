package com.sqli.train;

import com.sqli.train.entities.wagons.*;

import static com.sqli.train.configuration.Configuration.*;

/**
 * Created by Ayoub BOUGSID on 05/12/2016.
 */

public class WagonFactory {

    public static Wagon getWagon(char type) {
        switch (type) {
            case HEAD:
                return new Head();
            case PASSENGER:
                return new Passenger();
            case RESTAURANT:
                return new Restaurant();
            case CARGO:
                return new Cargo();
        }
        return null;
    }
}
