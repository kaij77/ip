package duke.command;

import duke.TaskList;
import duke.Ui;

public class ToDoCommand extends Command {
    private String description;

    public ToDoCommand(String description) {
        this.description = description;
    }

    @Override
    public void execute(TaskList taskList, Ui ui) {
        ui.printAddTask(taskList.addToDo(this.description));
        ui.printSizeOfList(taskList.size());
    }
}
