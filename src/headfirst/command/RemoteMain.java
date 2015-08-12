package headfirst.command;

public class RemoteMain {

    public static void main(String[] args) {
        String[] locations = {"거실", "부엌", "욕실", "방1", "방2"};
        RemoteController controller = new RemoteController(locations.length);
        controller.addCommands(locations);

        controller.onButtonPushed(1);
        controller.offButtonPushed(1);
    }
}
