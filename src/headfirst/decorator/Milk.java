package headfirst.decorator;

public class Milk extends BeverageDecorator {

    public Milk (Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getAdditionName() {
        return "우유";
    }

    @Override
    public int getAdditionPrice() {
        return 500;
    }
}
