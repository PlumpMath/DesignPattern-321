package headfirst.templatemethod;

public class Tea extends Beverage {

    @Override
    public void brew() {
        System.out.println("brewing Tea~~");
    }

    @Override
    public boolean isWaiting() {
        return true;
    }
}
