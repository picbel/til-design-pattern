package designpattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList(); // 일대다 관계를 위해 옵저버를 ArrayList로 관리합니다.
    }

    //subject의 인터페이스를 구현하는 코드
    @Override
    public void registerObserver(ObserverH o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverH o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            ObserverH observerH = (ObserverH) observers.get(i);
            observerH.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }
}
