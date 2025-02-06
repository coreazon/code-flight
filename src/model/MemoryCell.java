package model;

import com.sun.jdi.Value;
import model.ai.AICommand;
import model.args.Argument;

public class MemoryCell {

    //last memorycell pints to first one again

    private final AICommand command;
    private final Argument a;
    private final Argument b;
    private final int id;

    public MemoryCell(AICommand command, Argument a, Argument b, int id) {
        this.command = command;
        this.a = a;
        this.b = b;
        this.id = id;
    }

    public AICommand getCommand() {
        return command;
    }

    public Argument getA() {
        return a;
    }

    public Argument getB() {
        return b;
    }

    public int getId() {
        return id;
    }

    public void swapFirstAndSecond(MemoryCell other) {
        var valueA = a.getValue();
        a.setValue(other.getB().getValue());
        other.getB().setValue(valueA);
    }

    public void copy(MemoryCell other) {
        a.setValue(other.getA().getValue());
        b.setValue(other.getB().getValue());
    }
}
