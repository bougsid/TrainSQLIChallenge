package com.sqli.train.configuration;

/**
 * Created by Ayoub BOUGSID on 05/12/2016.
 */

//General App Configuration
public interface Configuration {

    //Define Wagon characters this values used by WagonFactory to instantiate wagons
    char HEAD = 'H';
    char PASSENGER = 'P';
    char RESTAURANT = 'R';
    char CARGO = 'C';

    //Wagons Connector
    String CONNECTOR = "::";
}
