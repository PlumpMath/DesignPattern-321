package headfirst.decorator;

public abstract class BeverageDecorator extends Beverage {

    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        super(beverage.getMenuName(), beverage.getPrice());
        this.beverage = beverage;
    }
    // 책에서 concrete decorator에서 구현해야할 생성자와
    // get description, price를 몽땅 일반화하고
    // addition name, price 함수를 abstract로 구현을 강제해 저것만 구현하도록 함.

    public abstract String getAdditionName();

    public abstract int getAdditionPrice();

    @Override
    public String getMenuName() {
        return beverage.getMenuName() + " + " + getAdditionName();
    }

    @Override
    public int getPrice() {
        return beverage.getPrice() + getAdditionPrice();
    }
}
