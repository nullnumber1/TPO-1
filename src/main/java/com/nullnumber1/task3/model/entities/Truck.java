package com.nullnumber1.task3.model.entities;

import com.nullnumber1.task3.exception.OutOfCapacityException;
import com.nullnumber1.task3.model.Entity;

public class Truck implements Entity {
    private final int capacity;
    private boolean isDriving;
    private boolean isLoading;
    private int amountLoaded;

    public Truck(int capacity) {
        this.capacity = capacity;
    }

    public void drive() {
        isDriving = true;
        System.out.println("The truck drives away");
    }

    public void load(String cargo, int amount) throws OutOfCapacityException {
        if (amountLoaded + amount > capacity) {
            throw new OutOfCapacityException();
        }
        isLoading = true;
        amountLoaded += amount;
        System.out.println("The truck starts loading " + cargo + " in amount of " + amount);
    }

    @Override
    public void performAction() {
        drive();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isDriving() {
        return isDriving;
    }

    public boolean isLoading() {
        return isLoading;
    }

    public int getAmountLoaded() {
        return amountLoaded;
    }
}