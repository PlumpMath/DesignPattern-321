package headfirst.state;

public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;

    private State currentState;
    private int numberOfGumballs;

    public GumballMachine(int numberOfGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.numberOfGumballs = numberOfGumballs;
        if (numberOfGumballs > 0) {
            currentState = noQuarterState;
        }
    }

    public void setState(State state) {
        currentState = state;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void releaseBall() {
        System.out.println("검볼이 나갑니다아~");

        if (numberOfGumballs > 0) {
            numberOfGumballs -= 1;
        }
    }

    public int getNumberOfGumballs() {
        return numberOfGumballs;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }
}
