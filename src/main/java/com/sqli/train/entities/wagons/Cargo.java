package com.sqli.train.entities.wagons;

/**
 * Created by Ayoub BOUGSID on 05/12/2016.
 */
public class Cargo extends Wagon {
    private boolean notEmpty;

    public boolean isNotEmpty() {
        return notEmpty;
    }

    public void setNotEmpty(boolean notEmpty) {
        this.notEmpty = notEmpty;
    }

    @Override
    public String designWagon() {
        return (this.notEmpty) ? "|^^^^|" : "|____|";
    }
}
