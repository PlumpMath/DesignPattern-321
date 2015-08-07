package headfirst.observer.v1;

public class WeatherStationMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4);
        System.out.println();

        Observer forecastDisplay = new ForecastDisplay(weatherData);
        //날씨 예측 디스플레이를 추가

        weatherData.setMeasurements(82, 70, 29.2);
        System.out.println();

        weatherData.deleteObserver(forecastDisplay);
        //예측 디스플레이 삭제
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
