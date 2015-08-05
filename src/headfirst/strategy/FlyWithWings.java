package headfirst.strategy;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("나는 날개로 날지요. 호호");
    }
}
