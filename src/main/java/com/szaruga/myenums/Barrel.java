package com.szaruga.myenums;

public enum Barrel {
    BARREL_ONE_CAPACITY(5.0),
    BARREL_TWO_CAPACITY(4.0);
    public final double capacity;

    Barrel(double capacity) {
        this.capacity = capacity;
    }
}