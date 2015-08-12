package headfirst.command;

public class RemoteController {

    private Command onCommand;
    private Command offCommand;

    public void setCommand(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void onButtonPushed() {
        onCommand.execute();
    }

    public void offButtonPushed() {
        offCommand.execute();
    }
}
