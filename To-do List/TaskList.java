import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markAsCompleted();
            System.out.println("Task marked as completed: " + task.getDescription());
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask.getDescription());
        } else {
            System.out.println("Invalid task index");
        }
    }
}
