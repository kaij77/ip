package duke.command;

import duke.TaskList;
import duke.Ui;

import java.time.LocalDate;

public class DeadlineCommand extends Command {
    private String description;
    private LocalDate by;

    public DeadlineCommand(String description, LocalDate by) {
        this.description = description;
        this.by = by;
    }

    @Override
    public void execute(TaskList taskList, Ui ui) {
        ui.printAddTask(taskList.addDeadline(this.description, this.by));
        ui.printSizeOfList(taskList.size());
    }
}
