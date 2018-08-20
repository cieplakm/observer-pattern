package com.mmc.patterns.observer;

public class TVP1TV implements Media, Observer {

    @Override
    public void informAboutLottoDrawLots(Integer[] lots) {
        LotsPrinter.displayLots(lots);
    }

    @Override
    public void update(Integer[] lots) {
        System.out.println("TVP1 TV NEWS:");
        informAboutLottoDrawLots(lots);
    }

}

