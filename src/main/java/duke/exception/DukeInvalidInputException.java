package duke.exception;

/**
 * A Duke.DukeInvalidInputException is thrown if the user gives an unknown input/command.
 */
public class DukeInvalidInputException extends DukeException {

    /**
     * Public constructor for a Duke.DukeInvalidInputException which will print the standardized message when thrown and
     * caught.
     */
    public DukeInvalidInputException() {
        super("☹ OOPS!!! I'm sorry, but I don't know what that means D:");
    }
}
