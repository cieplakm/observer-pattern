package com.mmc.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void registerObserver(Observer observer){
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }
}
