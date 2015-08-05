package headfirst.strategy;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥이 아니라 스뀍?!");
    }
}
