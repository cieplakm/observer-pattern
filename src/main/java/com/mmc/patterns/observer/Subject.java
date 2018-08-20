package com.mmc.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void notifyObservers(Integer[] lots){
        for (Observer observer : observers) {
            observer.update(lots);
        }
    }

    public void registerObserver(Observer observer){
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }
}
