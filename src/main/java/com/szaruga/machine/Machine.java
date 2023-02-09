package com.szaruga.machine;

import com.szaruga.myenums.MyStrings;
import com.szaruga.vessel.Glass;

public class Machine {
    double barrelOne;
    double barrelTwo;

    public Machine(double barrelOne, double barrelTwo) {
        this.barrelOne = barrelOne;
        this.barrelTwo = barrelTwo;
    }

    private boolean isGlass(Glass insert) {
        boolean isGlass = false;
        if (insert == null) {
            System.out.println(MyStrings.STRINGS_CHAMBER_INSERT_GLASS.string);
        } else {
            isGlass = true;
        }
        return isGlass;
    }

    private double checkGlassCapacity(Glass insert) {
        boolean isGlass = isGlass(insert);
        double capacityGlass = 0;
        if (isGlass) {
            capacityGlass = insert.getCapacityGlass();
            System.out.println(MyStrings.STRINGS_CHAMBER_GLASS_IN.string);
        } else {
            System.out.println(MyStrings.STRINGS_CHAMBER_WRONG.string);
        }
        return capacityGlass;
    }

    private double checkBarrelCapacity(double barrel) {
        double barrelCapacity = 0;
        if (barrel >= 0.3) {
            barrelCapacity = barrel;
        } else {
            System.out.println(MyStrings.STRINGS_BARREL_EMPTY.string);
        }
        return barrelCapacity;
    }

    public void fillGlass(Glass insert, double barrel) {
        double capacityGlass = checkGlassCapacity(insert);
        double checkBarrelCapacity = checkBarrelCapacity(barrel);

        if (checkBarrelCapacity >= capacityGlass && capacityGlass != 0) {
            if (barrel == barrelOne) {
                barrelOne -= capacityGlass;
            } else if (barrel == barrelTwo) {
                barrelTwo -= capacityGlass;
            }
            System.out.println(MyStrings.STRINGS_FILL_MACHINE.string + capacityGlass + MyStrings.STRINGS_FILL_YES.string);
        }
        if (checkBarrelCapacity < 0.3 || capacityGlass > checkBarrelCapacity) {
            System.out.println(MyStrings.STRINGS_BARREL_ASK.string);
        }
        if (capacityGlass == 0) {
            System.out.println(MyStrings.STRINGS_CHAMBER_MISSING.string);
        }
    }
}