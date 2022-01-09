package designpattern.strategy;

public class BowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("활을 쏘다");
    }
}
