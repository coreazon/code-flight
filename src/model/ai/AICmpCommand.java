package model.ai;

import messages.Messages;
import model.MemoryCell;

public class AICmpCommand extends AICommand {

    private static final String CMP = "CMP";
    private final MemoryCell a;
    private final MemoryCell b;

    public AICmpCommand(MemoryCell a, MemoryCell b) {
        super(CMP);
        this.a = a;
        this.b = b;
    }

    @Override
    String executeCommand() {

        boolean equals = a.getA().equals(b.getB());

        if (!equals) return Messages.NOT_OK;

        return Messages.OK;
    }
}
