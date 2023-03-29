package com.nullnumber1.task3.exception;

public class OutOfCapacityException extends Exception {
    public OutOfCapacityException() {
        super("The truck has reached its capacity limit.");
    }
}