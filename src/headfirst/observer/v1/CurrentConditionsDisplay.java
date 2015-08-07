package headfirst.observer.v1;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
        // Observer 객체인 자기자신을 Subject에 등록한다.
    }

    @Override
    public void update(double temp, double humid, double pressure) {
        this.temperature = temp;
        this.humidity = humid;

        display();
    }

    @Override
    public void display() {
        System.out.print("Current Temperature: " + temperature);
        System.out.println(", Humidity: " + humidity);
    }
}
