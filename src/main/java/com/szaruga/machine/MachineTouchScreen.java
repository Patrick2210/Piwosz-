package com.szaruga.machine;

import com.szaruga.myenums.MyStrings;
import com.szaruga.vessel.Glass;

import java.util.Scanner;

public class MachineTouchScreen {
    Machine machine;

    public MachineTouchScreen(Machine machine) {
        this.machine = machine;
    }

    private String welcome() {
        return MyStrings.STRINGS_CHAMBER_OPEN.string
                + MyStrings.STRINGS_MENU_ONE.string
                + MyStrings.STRINGS_BEER_ONE.string
                + MyStrings.STRINGS_MENU_TWO.string
                + MyStrings.STRINGS_BEER_TWO.string;
    }

    public void menu(Glass insert) {
        System.out.println(welcome());

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            number = scanner.nextInt();
            if (number == 1) {
                machine.fillGlass(insert, machine.barrelOne);
            }
            if (number == 2) {
                machine.fillGlass(insert, machine.barrelTwo);
            } else if (number != 1 && number != 2) {
                System.out.println(MyStrings.STRINGS_MENU_BUTTON.string);
            }
        } while (number != 1 && number != 2);
    }
}