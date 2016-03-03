package patterns.observer.impl;

import patterns.observer.api.Observer;

public class Surpriseable implements Observer {

    public static int count;
    private int id;

    public Surpriseable() {
        this.id = ++Surpriseable.count;
    }

    @Override
    public void update() {
        surprise();
    }

    private void surprise() {

        System.out.println(id + " has been surprised!!!");
    }
}
