package com.szaruga.machine;

import com.szaruga.myenums.MyStrings;
import com.szaruga.vessel.Glass;

import java.util.Scanner;

public class TouchScreen extends Machine {
    public TouchScreen(double barrelOne, double barrelTwo) {
        super(barrelOne, barrelTwo);
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
                fillGlass(insert, barrelOne);
            }
            if (number == 2) {
                fillGlass(insert, barrelTwo);
            } else if (number != 1 && number != 2) {
                System.out.println(MyStrings.STRINGS_MENU_BUTTON.string);
            }
        } while (number != 1 && number != 2);
    }
}