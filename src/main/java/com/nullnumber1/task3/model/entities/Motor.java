package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.model.Entity;

public class Motor implements Entity {
    @Override
    public void performAction() {
        makeNoise();
    }

    public void makeNoise() {
        System.out.println("The motor makes noise.");
    }
}
