package headfirst.factorymethod;

import java.util.HashMap;

public class PizzaFactory {

    public static Pizza createPizza(String menu) {
        HashMap<String, Pizza> mapper = new HashMap<String, Pizza>();
        mapper.put("cheese", new CheesePizza());
        mapper.put("pepperoni", new PepperoniPizza());

        return mapper.get(menu);
    }
}
