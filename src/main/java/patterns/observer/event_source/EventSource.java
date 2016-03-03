package patterns.observer.event_source;

import java.util.Observable;
import java.util.Scanner;

public class EventSource extends Observable implements Runnable {


    @Override
    public void run() {

        String response = "";

        while (!response.equals("exit")) {

            response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}
