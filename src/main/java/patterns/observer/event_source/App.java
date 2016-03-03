package patterns.observer.event_source;

import java.util.Observable;
import java.util.Observer;

import static java.lang.System.out;

public class App {

    public static void main(String[] args) {

        out.println("Enter text >");

        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                out.println("\nReceived response: " + arg);
            }
        });

        new Thread(eventSource).start();
    }
}
