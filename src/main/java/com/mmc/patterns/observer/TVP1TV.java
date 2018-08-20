package com.mmc.patterns.observer;

public class TVP1TV implements Media, Observer {
    private LottoLotsSource lottoLotsSource;

    public TVP1TV(LottoLotsSource lottoLotsSource) {
        this.lottoLotsSource = lottoLotsSource;
    }

    @Override
    public void informAboutLottoDrawLots() {
        Integer[] lots = lottoLotsSource.getLots();
        LotsPrinter.displayLots(lots);
    }

    @Override
    public void update() {
        System.out.println("TVP1 TV NEWS:");
        informAboutLottoDrawLots();
    }

}

