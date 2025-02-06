package model.ai;

import model.args.Argument;

public class AICommand {

    //command takes 1 or 2 args

    private final String commandName;
    private final Argument argumentA;
    private final Argument argumentB;

    public AICommand(String commandName,Argument argumentA, Argument argumentB) {
        this.commandName = commandName;
        this.argumentA = argumentA;
        this.argumentB = argumentB;
    }

    public String getCommandName() {
        return commandName;
    }

    public Argument getArgumentA() {
        return argumentA;
    }

    public Argument getArgumentB() {
        return argumentB;
    }
}
