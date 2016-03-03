package patterns.observer.api;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyEvent();
}
