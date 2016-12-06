package com.sqli.train;

import com.sqli.train.configuration.Configuration;
import com.sqli.train.entities.wagons.Cargo;
import com.sqli.train.entities.wagons.Head;
import com.sqli.train.entities.wagons.Wagon;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Train {

    private List<Wagon> wagons;

    Train(String structure) {
        this.wagons = new ArrayList<>();
        for (int i = 0; i < structure.length(); i++) {
            char c = structure.charAt(i);
            Wagon wagon = WagonFactory.getWagon(c);
            if (c == 'H' && i == 0) {
                assert wagon != null;
                ((Head) wagon).setLast(true);
            }
            this.wagons.add(wagon);
        }
    }

    String print() {
        StringBuilder builder = new StringBuilder();
        for (Wagon wagon : this.wagons) {
            builder.append(wagon.designWagon()).append(Configuration.CONNECTOR);
        }
        return builder.toString().substring(0, builder.toString().length() - 2);
    }

    void detachEnd() {
        this.wagons.remove(this.wagons.size() - 1);
    }

    void detachHead() {
        this.wagons.remove(0);
    }

    boolean fill() {
        Optional<Wagon> optional = this.wagons
                .stream()
                .filter(wagon -> {
                    if (wagon instanceof Cargo)
                        if (!((Cargo) wagon).isNotEmpty()) return true;
                    return false;
                }).findFirst();

        if (optional.isPresent()) {
            ((Cargo) optional.get()).setNotEmpty(true);
        }
        return false;
    }
}
