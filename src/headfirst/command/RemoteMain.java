package headfirst.command;

public class RemoteMain {

    public static void main(String[] args) {
        Light light = new Light("거실");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteController controller = new RemoteController();
        controller.setCommand(lightOnCommand, lightOffCommand);

        controller.onButtonPushed();
        controller.offButtonPushed();
    }
}
