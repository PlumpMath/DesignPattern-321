package headfirst.command;

public class AllOnMacroCommand implements Command {

    private Command[] onCommands;

    public  AllOnMacroCommand(Command[] onCommands) {
        this.onCommands = onCommands;
    }

    @Override
    public void execute() {
        for(Command command : onCommands) {
            command.execute();
        }
    }

    @Override
    public void undo() { }
}
