package headfirst.observer.v2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    Observable observable;
    private double temperature;
    private double humidity;
    private double pressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData data = (WeatherData)o;
        temperature = data.getTemperature();
        humidity = data.getHumidity();
        pressure = data.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.println("만날 틀려서 미안해....ㅠ");
    }
}
