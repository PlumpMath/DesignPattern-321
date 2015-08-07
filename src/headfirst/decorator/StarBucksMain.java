package headfirst.decorator;

public class StarBucksMain {

    private static void printBeverageInfo(Beverage beverage) {
        String menuName = beverage.getMenuName();
        System.out.println(menuName);
        int price = beverage.getPrice();
        System.out.println(price);
    }

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();

        printBeverageInfo(beverage1);
    }
}
