import java.lang.reflect.Array;

/**
 * The Deadline class extends the Task class as it is a more specific type of task.
 */
import java.time.LocalDate;

public class Deadline extends Task {
    private String by;
    private LocalDate date;

    public Deadline(String description, String by) {
        super(description);
        this.by = by;
        this.date = LocalDate.parse(by);
    }

    private String printDate() {
        return String.format("%s %d %d",
                this.date.getMonth().toString().substring(0, 3),
                this.date.getDayOfMonth(),
                this.date.getYear());
    }

    @Override
    public String getTaskType() {
        return "D";
    }

    @Override
    public String stringifyTask() {
        return String.format("%s | %s | %s", "D", super.stringifyTask(), this.by);
    }

    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), this.printDate());
    }
}
