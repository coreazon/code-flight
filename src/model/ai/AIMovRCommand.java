package model.ai;

import messages.Messages;
import model.MemoryCell;

public class AIMovRCommand extends AICommand{

    private static final String MOV_R = "MOV_R";
    private final MemoryCell a;
    private final MemoryCell b;

    public AIMovRCommand(MemoryCell a, MemoryCell b) {
        super(MOV_R);
        this.a = a;
        this.b = b;
    }

    @Override
    String executeCommand() {

        b.copy(a);

        return Messages.OK;
    }
}
