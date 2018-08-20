package com.mmc.patterns.observer;

import java.util.Random;

public class Lotto extends Subject implements Drawable {

    @Override
    public void drawLots() {
        Random ran = new Random();
        Integer[] lots = new Integer[6];
        for (int i = 0; i < 6; i++) {
            int num = ran.nextInt(49) + 1;
            lots[i] = num;
        }

        notifyObservers(lots);
    }

}
