package headfirst.observer.v1;

public interface Subject {

    void registerObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver();
}
