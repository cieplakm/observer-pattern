package com.mmc.patterns.observer;

public class Radio implements Media, Observer {

    @Override
    public void informAboutLottoDrawLots(Integer[] lots) {
        LotsPrinter.displayLots(lots);
    }

    @Override
    public void update(Integer[]lots) {
        informAboutLottoDrawLots(lots);
    }

}
