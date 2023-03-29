package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Gnome implements Entity {
    private boolean isRidingCarousel;
    private boolean isRunning;

    public void rideCarousel() {
        isRidingCarousel = true;
        System.out.println("The gnome rides the carousel");
    }

    public void run() {
        isRunning = true;
        System.out.println("The gnome runs away");
    }

    @Override
    public void performAction() {
        rideCarousel();
        run();
    }

    public boolean isRidingCarousel() {
        return isRidingCarousel;
    }

    public boolean isRunning() {
        return isRunning;
    }
}