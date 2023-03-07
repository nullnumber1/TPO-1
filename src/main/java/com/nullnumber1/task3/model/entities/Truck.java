package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.exception.OutOfCapacityException;
import com.nullnumber1.task3.model.Entity;

public class Truck implements Entity {
    private final int capacity;

    public Truck(int capacity) {
        this.capacity = capacity;
    }

    public void drive() {
        System.out.println("The truck drives away");
    }

    public void load(String cargo, int amount) throws OutOfCapacityException {
        if (amount >= capacity) {
            throw new OutOfCapacityException();
        }
        System.out.println("The truck starts loading " + cargo + " in amomunt of " + amount);
    }

    @Override
    public void performAction() {
        drive();
    }
}
