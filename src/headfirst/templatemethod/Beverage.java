package headfirst.templatemethod;

public abstract class Beverage {

    public final void prepareBeverage() {
        boilWater();
        brew();
        if (isWaiting()) {
            waiting();
        }
        pourInCup();
        System.out.println();
    }

    private void boilWater() {
        System.out.println("Boggle Boggle~~");
    }

    private void pourInCup() {
        System.out.println("Cup is full!");
    }

    private void waiting() {
        System.out.println("wait 3 min");
    }

    public abstract boolean isWaiting();

    public abstract void brew();
}
