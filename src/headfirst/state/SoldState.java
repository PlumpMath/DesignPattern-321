package headfirst.state;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("잠시만 기다려주세요. 알맹이가 나가구 있어용.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑았어요");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세욥");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getNumberOfGumballs() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("앗 검볼이 다 떨어졌다...");

        }
    }
}
