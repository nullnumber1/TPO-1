package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Gnome implements Entity {
    public void rideCarousel() {
        System.out.println("The gnome rides the carousel");
    }

    public void run() {
        System.out.println("The gnome runs away");
    }
    @Override
    public void performAction() {
        rideCarousel();
        run();
    }
}
