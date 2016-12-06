package com.sqli.train.entities.wagons;

/**
 * Created by Ayoub BOUGSID on 05/12/2016.
 */
public class Head extends Wagon {
    private boolean last;

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    @Override
    public String designWagon() {
        return (this.last) ? "<HHHH" : "HHHH>";
    }
}
