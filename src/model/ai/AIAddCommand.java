package model.ai;

import model.args.Argument;

/**
 * The ADD command add the value of argument A, argument B and stores the result
 * in the memory of argument B
 *
 * @author coreazon
 * @version 1.0
 */
public class AIAddCommand extends AICommand {

    private static final String ADD_COMMAND = "ADD";
    private final Argument a;
    private final Argument b;

    public AIAddCommand(Argument a, Argument b) {
        super(ADD_COMMAND);
        this.a = a;
        this.b = b;
    }

    @Override
    String executeCommand() {

        this.b.add(a);

        return b.toString();
    }
}
