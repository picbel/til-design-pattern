package designpattern.observer;

public class CurrentConditionsDisplay implements ObserverH, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature + "F degrees and" + humidity + "% humidity");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    //옵저버객체에서 삭제한후를 보려고 작성한코드입니다
    public void removeOb(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.removeObserver(this);
    }

}
