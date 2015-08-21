package headfirst.state;

public class GumballMachineMain {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(1);

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println();
        machine.insertQuarter();
        machine.turnCrank();
    }
}
