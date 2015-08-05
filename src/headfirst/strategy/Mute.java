package headfirst.strategy;

public class Mute implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("(아...나도 꽥!하고싶다...)");
    }
}
