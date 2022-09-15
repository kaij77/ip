package duke.exception;

/**
 * A Duke.DukeInvalidDeletionException is thrown if the user tries to delete a task that doesn't exist, or if the user
 * tries to perform a deletion on an empty task list.
 */
public class DukeInvalidDeletionException extends DukeException {
    /**
     * Public constructor for a Duke.DukeInvalidDeletionException.
     *
     * @param message the message to be printed when a Duke.DukeInvalidDeletionException is thrown and caught.
     */
    public DukeInvalidDeletionException(String message) {
        super(message);
    }
}
