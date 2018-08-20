package com.mmc.patterns.observer;

public class ObserverApp {

    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        Media radio = new Radio(lotto);
        Media tvp1TV = new TVP1TV(lotto);

        lotto.registerObserver((Observer) radio);
        lotto.registerObserver((Observer) tvp1TV);

        lotto.drawLots();
    }
}
