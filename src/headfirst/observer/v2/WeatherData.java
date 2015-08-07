package headfirst.observer.v2;

import java.util.Observable;

public class WeatherData extends Observable {

    private double temperature;
    private double humidity;
    private double pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
        // notifyObservers 메소드가 호출되면 각 옵저버들에게 업데이트를 날리는데,
        // 그 업데이트 메소드의 파라미터가 Observable이다.
        // 즉 notifyObservers 메소드를 사용한 객체 자신이 파라미터로 넘어간다.
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
