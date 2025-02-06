package command;

import errors.Errors;
import errors.SyntaxException;
import errors.TaskException;
import model.TaskHandler;
import model.logic.*;
import model.logic.users.*;

import java.util.List;

/**
 * The enum which holds all the Commands and is used to execute them
 *
 * @author urliz
 * @version 1.0
 */
public enum Commands {

    //TODO: add "help" string for each command

    /**
     * example command
     */
    HELP(CommandParserExecute.HELP_COMMAND, CommandParserExecute.REGEX_HELP_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    ADD_AI(CommandParserExecute.ADD_AI_COMMAND, CommandParserExecute.REGEX_ADD_AI_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    REMOVE_AI(CommandParserExecute.REMOVE_AI_COMMAND, CommandParserExecute.REGEX_REMOVE_AI_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    SET_INIT_MODE(CommandParserExecute.SET_INIT_MODE_COMMAND, CommandParserExecute.REGEX_SET_INIT_MODE_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    START_GAME(CommandParserExecute.START_GAME_COMMAND, CommandParserExecute.REGEX_START_GAME_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    NEXT(CommandParserExecute.NEXT_COMMAND, CommandParserExecute.REGEX_NEXT_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    SHOW_MEMORY(CommandParserExecute.SHOW_MEMORY_COMMAND, CommandParserExecute.REGEX_SHOW_MEMORY_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    SHOW_AI(CommandParserExecute.SHOW_AI_COMMAND, CommandParserExecute.REGEX_SHOW_AI_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    END_GAME(CommandParserExecute.END_GAME_COMMAND, CommandParserExecute.REGEX_END_GAME_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {
            String resultMessage;


            try {
                resultMessage = taskHandler.example(Object);

            } catch (TaskException e) {
                return new Result(Result.ResultType.FAILURE, e.getMessage());
            }
            return new Result(Result.ResultType.SUCCESS, resultMessage);
        }
    },
    /**
     * the quit command
     */
    QUIT(CommandParserExecute.QUIT_COMMAND, CommandParserExecute.REGEX_QUIT_COMMAND) {
        @Override
        public Result executeCommand(List<String> parameters, TaskHandler taskHandler) {

            return new Result(Result.ResultType.SUCCESS);
        }
    };


    private final String commandName;
    private final String regexOfCommand;

    /**
     * constructor of a command
     *
     * @param commandName    the name of the command
     * @param regexOfCommand the regex which corresponds to the Command
     */
    Commands(String commandName, String regexOfCommand) {
        this.commandName = commandName;
        this.regexOfCommand = regexOfCommand;
    }

    /**
     * gets a command through the String representation
     *
     * @param commandName the command name
     * @return the found command
     * @throws SyntaxException if there is no command corresponding to the string
     */
    public static Commands getCommand(String commandName) throws SyntaxException {
        for (Commands command : Commands.values()) {
            if (command.commandName.equals(commandName)) return command;
        }
        throw new SyntaxException(Errors.COMMAND_NOT_IMPLEMENTED);
    }

    /**
     * returns the regex of a command
     *
     * @return the regex of a command
     */
    public String getRegexOfCommand() {
        return regexOfCommand;
    }

    /**
     * executes a command with its parameters
     *
     * @param parameters     the parameters
     * @param TaskHandler th database on which the command is performed
     * @return a Result which documents if the command succeeded or not and the corresponding message
     */
    public abstract Result executeCommand(List<String> parameters, TaskHandler TaskHandler);


}

