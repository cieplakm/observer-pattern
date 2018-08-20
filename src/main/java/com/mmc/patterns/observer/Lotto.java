package com.mmc.patterns.observer;

import java.util.Random;

public class Lotto extends Subject implements Drawable, LottoLotsSource {

    private Integer[] lots;

    @Override
    public void drawLots() {
        Random ran = new Random();
        lots = new Integer[6];
        for (int i = 0; i < 6; i++) {
            int num = ran.nextInt(49) + 1;
            lots[i] = num;
        }

        notifyObservers();
    }

    @Override
    public Integer[] getLots() {
        return lots;
    }
}
