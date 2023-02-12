package com.szaruga.main;

import com.szaruga.machine.Machine;
import com.szaruga.machine.MachineTouchScreen;
import com.szaruga.myenums.Barrel;
import com.szaruga.myenums.Glasses;
import com.szaruga.vessel.Glass;

public class Main {
    public static void main(String[] args) {

        Glass g1 = new Glass(Glasses.GLASS_SMALL.capacityGlass);
        Glass g2 = new Glass(Glasses.GLASS_MEDIUM.capacityGlass);
        Glass g3 = new Glass(Glasses.GLASS_LARGE.capacityGlass);

        Machine piwosz = new Machine(Barrel.BARREL_ONE_CAPACITY.capacity, Barrel.BARREL_TWO_CAPACITY.capacity);

        MachineTouchScreen ts = new MachineTouchScreen(piwosz);

        ts.menu(g1);
        ts.menu(g3);
        ts.menu(g2);
        ts.menu(g3);
        ts.menu(g1);
        ts.menu(g2);
        ts.menu(g3);
        ts.menu(g1);
        ts.menu(g3);
        ts.menu(null);
        ts.menu(g2);
        ts.menu(g2);
        ts.menu(g3);
        ts.menu(g1);
        ts.menu(g2);
        ts.menu(g3);
        ts.menu(g2);
        ts.menu(g1);
    }
}