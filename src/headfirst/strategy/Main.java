package headfirst.strategy;

public class Main {

    private static void printDuckBehavior(Duck duck) {
        duck.display();
        duck.performQuack();
        duck.performFly();
        System.out.println();
    }

    public static void main(String[] args) {
        Duck realDuck = new RealDuck();
//        realDuck.performFly();
        printDuckBehavior(realDuck);

        Duck decoyDuck = new DecoyDuck();
        printDuckBehavior(decoyDuck);

        Duck rubberDuck = new RubberDuck();
        printDuckBehavior(rubberDuck);
    }
}
