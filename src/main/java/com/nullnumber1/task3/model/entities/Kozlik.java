package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Kozlik implements Entity {
    public void getDizzy() {
        System.out.println("Kozlik gets dizzy.");
    }

    public void sit() {
        System.out.println("Kozlik sits down.");
    }

    public void holdOn() {
        System.out.println("Kozlik holds onto the ground.");
    }

    public void makeSounds() {
        System.out.println("Kozlik makes strange sounds.");
    }

    public void performAction() {
        getDizzy();
        sit();
        holdOn();
        makeSounds();
    }
}
