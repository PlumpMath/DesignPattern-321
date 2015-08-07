package headfirst.decorator;

public abstract class Beverage {

    private String menuName;
    private int price;

    public Beverage(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }
}
