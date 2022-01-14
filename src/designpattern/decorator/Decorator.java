package designpattern.decorator;

public class Decorator {
    public static abstract class Beverage {

        String description = "제목없음";

        public String getDescription() {
            return description;
        }
        public abstract double cost();
    }


    public static abstract class CondimentDecorator extends Beverage{
        public abstract String getDescription();
    }


    public static class Espresso extends Beverage{

        public Espresso() {
            description = "에스프레소";
        }

        @Override
        public double cost() {
            return 1.99;
        }
    }


    public static class HouseBlend extends Beverage{

        public HouseBlend() {
            description = "하우스 블렌드 커피";
        }

        @Override
        public double cost() {
            return 0.89;
        }
    }


    public static class Mocha extends CondimentDecorator {

        Beverage beverage;

        public Mocha (Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public double cost() {
            return .20 + beverage.cost();
        }

        @Override
        public String getDescription() {
            return beverage.getDescription() + ", 모카";
        }
    }


    public static class Soy extends CondimentDecorator {

        Beverage beverage;

        public Soy(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public double cost() {
            return .15 + beverage.cost();
        }

        @Override
        public String getDescription() {
            return beverage.getDescription() + ", 두유";
        }
    }


    public static class Whip extends CondimentDecorator {

        Beverage beverage;

        public Whip(Beverage beverage) {
            this.beverage = beverage;
        }

        @Override
        public double cost() {
            return .10 + beverage.cost();
        }

        @Override
        public String getDescription() {
            return beverage.getDescription() + ", 휘핑";
        }
    }
}
