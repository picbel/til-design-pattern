package designpattern.strategy;

public abstract class Character {

    // 캐릭터들의 현재 착용 무기입니다.
    WeaponBehavior weapon;

    // 캐릭터들은 모두 전투라는 기본적인 기능을 가집니다.
    public abstract void fight();

    //무기의 인터페이스구현클래스를 동적으로 교체하기위해 작성합니다
    public void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }
}