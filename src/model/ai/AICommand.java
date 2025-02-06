package model.ai;

import model.args.Argument;

public abstract class AICommand {


    private final String commandName;

    public AICommand(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    abstract String executeCommand();
}
