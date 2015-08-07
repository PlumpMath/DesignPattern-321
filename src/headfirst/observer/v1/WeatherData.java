package headfirst.observer.v1;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
//        int idx = observers.indexOf(observer);
//        if (idx >= 0) {
//            observers.remove(idx);
//        }
        // 찾아서 있으면 삭제, 없으면 그냥 끝
        observers.remove(observer);
        // 이것만 있어도 별 문제 없네요.
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
        // 책 코드는 너무 구식이에요. 이터레이터 패턴이나, foreach로 하는 게 좋을 거 같아요.
        // 여기서는 foreach를 사용했습니다.
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
