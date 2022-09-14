/**
 * The Deadline class extends the Task class as it is a more specific type of task.
 */
public class Event extends Task {
    private String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String getTaskType() {
        return "E";
    }

    @Override
    public String stringifyTask() {
        return String.format("%s | %s | %s", "E", super.stringifyTask(), this.at);
    }

    @Override
    public String toString() {
        return String.format("[E]%s (at: %s)", super.toString(), this.at);
    }
}
