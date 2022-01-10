package designpattern.singleton;

public class SingletonStatic {

    private volatile static SingletonStatic uniqueInstance;

    private SingletonStatic() {}

    public static SingletonStatic getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonStatic.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonStatic();
                }
            }
        }
        return uniqueInstance;
    }
}
