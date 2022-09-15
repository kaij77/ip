package duke.command;

import duke.TaskList;
import duke.Ui;

import java.time.LocalDate;

public class EventCommand extends Command {
    private String description;
    private LocalDate at;

    public EventCommand(String description, LocalDate at) {
        this.description = description;
        this.at = at;
    }

    @Override
    public void execute(TaskList taskList, Ui ui) {
        ui.printAddTask(taskList.addEvent(this.description, this.at));
        ui.printSizeOfList(taskList.size());
    }
}
