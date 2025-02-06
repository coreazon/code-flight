package model.ai;

import model.MemoryCell;
import model.args.Argument;

public class AIAddRCommand extends AICommand {

    private static final String ADD_R_COMMAND = "ADD_R";
    private final Argument a;
    private final MemoryCell b;

    public AIAddRCommand(Argument a, MemoryCell b) {
        super(ADD_R_COMMAND);
        this.a = a;
        this.b = b;
    }

    @Override
    String executeCommand() {

        b.getB().add(a);

        return b.getB().toString();
    }
}
