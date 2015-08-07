package headfirst.observer.v1;


public class ForecastDisplay implements Observer, DisplayElement {

    private double temperature;
    private double humidity;
    private double pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humid, double pressure) {
        this.temperature = temp;
        this.humidity = humid;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("Sorry, We don't guess tomorrow Temperature");
    }
}
