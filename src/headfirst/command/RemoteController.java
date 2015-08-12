package headfirst.command;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private int size;

    public RemoteController(int size) {
        this.size = size;
        onCommands = new Command[size];
        offCommands = new Command[size];
        Command noCommand = new NoCommand();

        for (int i = 0; i < size; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int selected, Command onCommand, Command offCommand) {
        onCommands[selected] = onCommand;
        offCommands[selected] = offCommand;
    }

    public void onButtonPushed(int selected) {
        if (selected < size) {
            onCommands[selected].execute();
        }
        else {
            System.out.println("잘못된 명령입니다.");
        }
    }

    public void offButtonPushed(int selected) {
        if (selected < size) {
            onCommands[selected].execute();
        }
        else {
            System.out.println("잘못된 명령입니다.");
        }
    }
}
