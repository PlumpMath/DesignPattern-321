package headfirst.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("러버덕 와쪄. 내가 돌아와쪄.");
    }
}
