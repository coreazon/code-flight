package model.ai;

import messages.Messages;
import model.MemoryCell;

public class AIMovICommand extends AICommand {

    private static final String MOV_I = "MOV_I";
    private final MemoryCell a;
    private final MemoryCell b;

    public AIMovICommand(MemoryCell a, MemoryCell b) {
        super(MOV_I);
        this.a = a;
        this.b = b;
    }

    @Override
    String executeCommand() {

        b.copy(a);
        return Messages.OK;
    }
}
