package designpattern.strategy;

public class Main {
    public static void main(String[] args) {

        Knight k = new Knight();

        //기사가 검을 쓸때
        System.out.println("검 사용");
        k.setWeapon(new SwordBehavior());
        k.fight();

        //기사가 활을 쓸때
        System.out.println("활 사용");
        k.setWeapon(new BowBehavior());
        k.fight();

    }

}
