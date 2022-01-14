package designpattern.observer;

public interface Subject {

    //옵저버를 등록하고 제거하는 역할의 메서드
    public void registerObserver(ObserverH o);
    public void removeObserver(ObserverH o);

    //주제 객체의 상태가 변경되었을때 모든 옵저버들에게 알리기위해 호출되는 메서드
    public void notifyObservers();

}