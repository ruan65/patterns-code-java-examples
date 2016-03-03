package patterns.observer.impl;

import patterns.observer.api.Observer;
import patterns.observer.api.Subject;

import java.util.ArrayList;
import java.util.List;

public class Surpriser implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyEvent() {
        if (observers.size() > 0) {
            for (Observer o : observers) {
                o.update();
            }
        }
    }
}
