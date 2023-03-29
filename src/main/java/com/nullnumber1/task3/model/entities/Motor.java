package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Motor implements Entity {
    private boolean isMakingNoise;

    @Override
    public void performAction() {
        makeNoise();
    }

    public void makeNoise() {
        isMakingNoise = true;
        System.out.println("The motor makes noise.");
    }

    public boolean isMakingNoise() {
        return isMakingNoise;
    }
}