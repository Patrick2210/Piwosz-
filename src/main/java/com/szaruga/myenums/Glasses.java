package com.szaruga.myenums;

public enum Glasses {
    GLASS_ONE(0.3),

    GLASS_TWO(0.5),

    GLASS_THREE(1.0);

    public final double capacityGlass;

    Glasses(double capacityGlass) {
        this.capacityGlass = capacityGlass;
    }
}
