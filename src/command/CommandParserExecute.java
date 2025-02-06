package command;

import core.Pair;
import errors.Errors;
import errors.SyntaxException;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a Command Parser, which has the purpose to check the Validation of the Syntax and handles
 * the conversion of the inputted String
 *
 * @author urliz
 * @version 1.0
 */
public class CommandParserExecute implements CommandParser {


    //COMMANDS here
    public static final String SPACE = " ";
    public static final String EMPTY_STRING = "";
    public static final char SPACE_CHAR = ' ';


    //REGEX here


    /**
     * check the input with the regex and throws Exception if it does not match
     * or returns the input as a Pair
     *
     * @param inputUser the whole input
     * @return the input as a Pair
     * @throws SyntaxException if the regex does not match
     */
    @Override
    public Pair<String, List<String>> parseCommand(String inputUser) throws SyntaxException {
        checkBasicRegex(inputUser);
        String commandValue = inputUser.split(SPACE)[0];

        return new Pair<>(checkCommand(commandValue, inputUser), createParameters(inputUser, commandValue));

    }

    private List<String> createParameters(String inputUser, String commandValue) {
        String modifiedInput = inputUser.substring(commandValue.length());
        if (modifiedInput.equals(EMPTY_STRING)) {
            return new LinkedList<>();
        }

        String[] outputAsStringArray = modifiedInput.substring(1).split(SPACE);
        return new LinkedList<>(Arrays.asList(outputAsStringArray));
    }

    private void checkBasicRegex(String inputUser) throws SyntaxException {
        if (inputUser.isEmpty()) throw new SyntaxException(Errors.COMMAND_PARAM_WRONG);
        if (inputUser.charAt(0) == SPACE_CHAR) {
            throw new SyntaxException(Errors.COMMAND_PARAM_WRONG);
        }
    }

    private String checkCommand(String command, String userInput) throws SyntaxException {


        if (userInput.matches(Commands.getCommand(command).getRegexOfCommand())) {
            return command;
        }
        throw new SyntaxException(Errors.COMMAND_PARAM_WRONG);
    }
}

