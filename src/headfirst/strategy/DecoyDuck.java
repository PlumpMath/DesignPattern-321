package headfirst.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("나는 가짜야. 실망하진 마ㅜ");
    }
}
