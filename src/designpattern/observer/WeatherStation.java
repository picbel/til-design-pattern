package designpattern.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30.4f);
        weatherData.setMeasurements(50, 42, 29.0f);

        //옵저버 삭제후 작동하는지
        currentConditionsDisplay.removeOb(weatherData);
        weatherData.setMeasurements(33, 12, 26.3f);
    }
}