package headfirst.factorymethod;

public class PizzaStore {

    private String location;

    public PizzaStore(String location) {
        this.location = location;
    }

    public void orderPizza(String menu) {
        Pizza orderdPizza = PizzaFactory.createPizza(menu);

        orderdPizza.prepare();
        orderdPizza.bake();
        orderdPizza.cut();
        orderdPizza.box();
        System.out.println();
    }
}
