package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Kozlik implements Entity {
    private boolean isDizzy;
    private boolean isSitting;
    private boolean isHoldingOn;
    private boolean isMakingSounds;

    public void getDizzy() {
        isDizzy = true;
        System.out.println("Kozlik gets dizzy.");
    }

    public void sit() {
        isSitting = true;
        System.out.println("Kozlik sits down.");
    }

    public void holdOn() {
        isHoldingOn = true;
        System.out.println("Kozlik holds onto the ground.");
    }

    public void makeSounds() {
        isMakingSounds = true;
        System.out.println("Kozlik makes strange sounds.");
    }

    public void performAction() {
        getDizzy();
        sit();
        holdOn();
        makeSounds();
    }

    public boolean isDizzy() {
        return isDizzy;
    }

    public boolean isSitting() {
        return isSitting;
    }

    public boolean isHoldingOn() {
        return isHoldingOn;
    }

    public boolean isMakingSounds() {
        return isMakingSounds;
    }
}

