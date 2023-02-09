package com.szaruga.myenums;

public enum MyStrings {
    STRINGS_CHAMBER_OPEN("Welcome in Piwosz\nBefore use it open chamber to insert glass\n"),
    STRINGS_CHAMBER_INSERT_GLASS("Please insert glass to chamber..."),
    STRINGS_CHAMBER_GLASS_IN("Glass in chamber... make sure to close chamber!"),
    STRINGS_CHAMBER_MISSING("Ops it seems to glass is missing...\n"),
    STRINGS_CHAMBER_WRONG("Something goes wrong..."),
    STRINGS_BARREL_EMPTY("It seems to barrel almost run out from bear..."),
    STRINGS_BARREL_ASK("Ask customer service for help!\n"),
    STRINGS_MENU_ONE("Press 1 for: "),
    STRINGS_MENU_TWO("\nPress 2 for: "),
    STRINGS_MENU_BUTTON("Please press correct button... "),
    STRINGS_FILL_MACHINE("Please wait, operation in progress...\n"),
    STRINGS_FILL_YES(" glass filed with bear.\n"),
    STRINGS_BEER_ONE("Perła"),
    STRINGS_BEER_TWO("Żywiec");
    public final String string;

    MyStrings(String str) {
        this.string = str;
    }
}