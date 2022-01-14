package designpattern.decorator;

public class TestCode {

    public static void main(String[] args) {
        //에소프레소
        Decorator.Beverage beverage = new Decorator.Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        //에소프레소에 휘핑하고 모카 추가
        Decorator.Beverage beverage2 = new Decorator.Espresso();
        beverage2 = new Decorator.Mocha(beverage2);
        beverage2 = new Decorator.Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        //하우스블랜드커피에 모카와 두유추가
        Decorator.Beverage beverage3 = new Decorator.HouseBlend();
        beverage3 = new Decorator.Mocha(beverage3);
        beverage3 = new Decorator.Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}