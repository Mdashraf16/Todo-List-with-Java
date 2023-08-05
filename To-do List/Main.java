import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskList taskList = new TaskList();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(description);
                    taskList.addTask(newTask);
                    System.out.println("Task added: " + newTask.getDescription());
                    break;
                case 2:
                    System.out.println("Tasks:");
                    taskList.listTasks();
                    break;
                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int completedIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    taskList.markTaskAsCompleted(completedIndex - 1);
                    break;
                case 4:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    taskList.removeTask(removeIndex - 1);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
