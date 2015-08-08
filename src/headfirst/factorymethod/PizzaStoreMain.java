package headfirst.factorymethod;

public class PizzaStoreMain {

    public static void main(String[] args) {

        PizzaStore store = new PizzaStore("Seoul");
        store.orderPizza("cheese");

        store.orderPizza("cheese");
    }
}
