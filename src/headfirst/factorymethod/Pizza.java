package headfirst.factorymethod;

public class Pizza {

    private String name;
    private String[] toppings;

    public Pizza(String name, String[] toppings) {
        this.name = name;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Toast Dough... ");
        System.out.println("Adding toppings... ");

        for(String topping : toppings) {
            System.out.println("add " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    public void cut() {
        System.out.println("Cutting Pizza");
    }

    public void box() {
        System.out.println("Pizza in Pizza Box");
    }

    public String getName() {
        return name;
    }
}
