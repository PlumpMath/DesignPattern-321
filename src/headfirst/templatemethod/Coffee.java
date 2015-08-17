package headfirst.templatemethod;

public class Coffee extends Beverage {

    @Override
    public void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    public boolean isWaiting() {
        return false;
    }
}
