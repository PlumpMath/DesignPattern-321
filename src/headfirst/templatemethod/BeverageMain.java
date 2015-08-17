package headfirst.templatemethod;

public class BeverageMain {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

        Beverage tea = new Tea();
        tea.prepareBeverage();
    }
}
