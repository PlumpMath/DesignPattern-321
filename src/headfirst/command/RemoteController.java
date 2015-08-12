package headfirst.command;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private Command macroCommand;
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
        undoCommand = noCommand;
        macroCommand = new AllOnMacroCommand(onCommands);
    }

    public void setCommand(int selected, Command onCommand, Command offCommand) {
        onCommands[selected] = onCommand;
        offCommands[selected] = offCommand;
    }

    public void onButtonPushed(int selected) {
        if (selected < size) {
            onCommands[selected].execute();
            undoCommand = onCommands[selected];
        }
        else {
            System.out.println("잘못된 명령입니다.");
        }
    }

    public void offButtonPushed(int selected) {
        if (selected < size) {
            offCommands[selected].execute();
            undoCommand = offCommands[selected];
        }
        else {
            System.out.println("잘못된 명령입니다.");
        }
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }

    public void allOnMacroPushed() {
        macroCommand.execute();
    }

    public void addCommand(int idx, String location) {
        Light light = new Light(location);
        setCommand(idx, new LightOnCommand(light), new LightOffCommand(light));
    }
    
    public void addCommands(String[] locations) {
        for (int i = 0; i < locations.length; i++) {
            if (i >= size) {
                System.out.println("더 이상 전등을 등록할 수 없습니다.");
                break;
            }
            addCommand(i, locations[i]);
        }
    }
}
