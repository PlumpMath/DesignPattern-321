package headfirst.templatemethod;

public abstract class Beverage {

    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
    }

    private void boilWater() {
        System.out.println("Boggle Boggle~~");
    }

    private void pourInCup() {
        System.out.println("Cup is full!");
    }

    public abstract void brew();
}
