package headfirst.state;

public class GumballMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private int numberOfGumballs;

    private State currentState;

    public GumballMachine(int numberOfGumballs) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);

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
        System.out.println("A Gumball comes rolling out the slot....");

        if (numberOfGumballs > 0) {
            numberOfGumballs -= 1;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }
}
