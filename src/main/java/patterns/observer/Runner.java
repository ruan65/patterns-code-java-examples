package patterns.observer;

import patterns.observer.api.Observer;
import patterns.observer.api.Subject;
import patterns.observer.impl.Surpriseable;
import patterns.observer.impl.Surpriser;

public class Runner {

    public static void main(String[] args) {

        Subject subject = new Surpriser();

        for (int i = 0; i < 5; i++) {
            subject.attach(new Surpriseable());
        }

        Observer sur6 = new Surpriseable();
        Observer sur7 = new Surpriseable();

        subject.attach(sur6);
        subject.attach(sur7);

        subject.notifyEvent();

        System.out.println("********* after detaching *****************");

        subject.detach(sur6);

        subject.notifyEvent();
    }
}
