package headfirst.command;

import java.util.HashMap;

public class RemoteMain {

    public static void main(String[] args) {
        String[] locations = {"거실", "부엌", "욕실", "방1", "방2"};

        HashMap<String, Integer> mapper = new HashMap<String, Integer>();
        for (int i = 0; i < locations.length; i++) {
            mapper.put(locations[i], i);
        }

        RemoteController controller = new RemoteController(locations.length);
        controller.addCommands(locations);

        controller.onButtonPushed(mapper.get("거실"));
        controller.offButtonPushed(mapper.get("거실"));

        controller.onButtonPushed(mapper.get("방1"));
        controller.undoButtonPushed();
        System.out.println();

        controller.allOnMacroPushed();
    }
}
