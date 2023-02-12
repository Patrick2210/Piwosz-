package com.szaruga.myenums;

public enum Glasses {
    GLASS_SMALL(0.3),
    GLASS_MEDIUM(0.5),
    GLASS_LARGE(1.0);
    public final double capacityGlass;

    Glasses(double capacityGlass) {
        this.capacityGlass = capacityGlass;
    }
}
