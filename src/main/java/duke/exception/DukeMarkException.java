package duke.exception;

/**
 * A duke.exception.DukeMarkException is thrown if the user tries to mark an already marked task, or if they try to un-mark a task
 * that is already un-marked.
 */
public class DukeMarkException extends DukeException {
    /**
     * Public constructor for a duke.exception.DukeMarkException.
     *
     * @param message the message to be printed when a duke.exception.DukeMarkException is thrown and caught.
     */
    public DukeMarkException(String message) {
        super(message);
    }
}
