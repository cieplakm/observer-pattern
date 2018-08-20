package com.mmc.patterns.observer;

public class LotsPrinter {
    private LotsPrinter() {
    }

    public static void displayLots(Integer[] lots) {
        System.out.println("Lotto numbers are: ");
        for (int lot : lots) {
            System.out.print(lot + ", ");
        }
        System.out.println();
    }
}
