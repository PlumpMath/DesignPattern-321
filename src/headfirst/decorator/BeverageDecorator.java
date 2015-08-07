package headfirst.decorator;

public abstract class BeverageDecorator extends Beverage {

    private Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        super(beverage.getMenuName(), beverage.getPrice());
        this.beverage = beverage;
    }

    public abstract String getAdditionName();

    public abstract int getAdditionPrice();

    @Override
    public String getMenuName() {
        return beverage.getMenuName() + " + " +getAdditionName();
    }

    @Override
    public int getPrice() {
        return beverage.getPrice() + getAdditionPrice();
    }
}
