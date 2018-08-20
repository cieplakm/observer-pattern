package com.mmc.patterns.observer;

public class Radio implements Media, Observer {
    private LottoLotsSource lottoLotsSource;

    public Radio(LottoLotsSource lottoLotsSource) {
        this.lottoLotsSource = lottoLotsSource;
    }

    @Override
    public void informAboutLottoDrawLots() {
        Integer[] lots = lottoLotsSource.getLots();
        LotsPrinter.displayLots(lots);
    }

    @Override
    public void update() {
        informAboutLottoDrawLots();
    }

}
