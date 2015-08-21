package headfirst.state;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("죄송해요ㅠ. 품절이에욥ㅠㅠ");
        ejectQuarter();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("죄송해요ㅠ. 품절이에욥ㅠㅠ");
    }

    @Override
    public void dispense() {
        System.out.println("죄송해요ㅠ. 품절이에욥ㅠㅠ");
    }
}
