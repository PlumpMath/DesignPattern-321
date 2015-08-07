package headfirst.observer.v2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    Observable observable;
    private double temperature;
    private double humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData data = (WeatherData)o;
        temperature = data.getTemperature();
        humidity = data.getHumidity();

        display();
    }

    @Override
    public void display() {
        System.out.print("Current Temperature: " + temperature);
        System.out.println(", Humidity: " + humidity);
    }
}
