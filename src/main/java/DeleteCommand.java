public class DeleteCommand extends Command {
    private int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList taskList, Ui ui) {
        ui.printDeleteTask(taskList.deleteTask(index));
        ui.printSizeOfList(taskList.size());
    }
}
