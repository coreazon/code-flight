package model.ai;

import model.MemoryCell;

public class AIJmpCommand extends AICommand {

    private static final String JMP = "JMP";
    private final MemoryCell target;

    public AIJmpCommand(MemoryCell target) {
        super(JMP);
        this.target = target;
    }

    @Override
    String executeCommand() {
        return null;
    }
}
