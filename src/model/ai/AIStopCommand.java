package model.ai;

public class AIStopCommand extends AICommand {

    private static final String STOP = "STOP";

    public AIStopCommand() {
        super(STOP);
    }

    @Override
    String executeCommand() {
        return "";
    }
}
