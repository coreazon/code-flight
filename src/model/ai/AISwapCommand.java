package model.ai;

import model.MemoryCell;

public class AISwapCommand extends AICommand {

    private static final String SWAP = "SWAP";
    private final MemoryCell a;
    private final MemoryCell b;

    public AISwapCommand(MemoryCell a, MemoryCell b) {
        super(SWAP);
        this.a = a;
        this.b = b;
    }

    @Override
    String executeCommand() {

        a.swapFirstAndSecond(b);

        return null;
    }
}
