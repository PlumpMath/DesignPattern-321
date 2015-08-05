package headfirst.strategy;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("난... 못날아요ㅠㅜ");
    }
}
