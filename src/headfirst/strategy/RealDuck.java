package headfirst.strategy;

public class RealDuck extends Duck {

    public RealDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("나는 진짜 오리거덩여?!");
    }
}
