package designpattern.strategy;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("검으로 찌르다");
    }
}