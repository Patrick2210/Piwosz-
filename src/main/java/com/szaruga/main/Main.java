package com.szaruga.main;

import com.szaruga.machine.TouchScreen;
import com.szaruga.myenums.Barrel;
import com.szaruga.myenums.Glasses;
import com.szaruga.vessel.Glass;

public class Main {
    public static void main(String[] args) {

        Glass g1 = new Glass(Glasses.GLASS_ONE.capacityGlass);
        Glass g2 = new Glass(Glasses.GLASS_TWO.capacityGlass);
        Glass g3 = new Glass(Glasses.GLASS_THREE.capacityGlass);

        TouchScreen ts = new TouchScreen(Barrel.BARREL_ONE_CAPACITY.capacity, Barrel.BARREL_TWO_CAPACITY.capacity);

        ts.menu(g1);
        ts.menu(g2);
        ts.menu(g3);
        ts.menu(null);
        ts.menu(g3);
        ts.menu(g2);
        ts.menu(g2);
        ts.menu(g3);
        ts.menu(g2);
        ts.menu(g1);
        ts.menu(g2);
        ts.menu(g3);
    }
}