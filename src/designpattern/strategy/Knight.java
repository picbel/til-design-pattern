package designpattern.strategy;

public class Knight extends Character{
    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
