package headfirst.decorator;

public class StarBucksMain {

    public static void main(String[] args) {
        Beverage esso = new Espresso();
        esso.printBeverageInfomation();

        Beverage latte = new Milk(new Espresso());
        latte.printBeverageInfomation();
    }
}
