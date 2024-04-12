import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Task> tasks = new ArrayList<>();
    
    public static void addTask(String name, String description) {
        Task task = new Task(name, description);
        tasks.add(task);
    }

    public static void removeTask(int index) {
        tasks.remove(index-1);
    }

    public static void markCompleted(int idx) {
        if (idx >= 0 && idx < tasks.size()) {
            Task task = tasks.get(idx-1);
            task.setCompleted(true);
        } else {
            System.out.println("Invalid task number");
        }
    }

    public static void markInProgress(int idx) {
        if (idx >= 0 && idx < tasks.size()) {
            Task task = tasks.get(idx-1);
            task.setCompleted(false);
        } else {
            System.out.println("Invalid task number");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("-------------------------------------------");
            System.out.println("To-Do List");
            System.out.println("-------------------------------------------");
            System.out.println("// 1 - Add Task // 2 - Remove Task // 3 - Mark task as completed // 4 - Mark task as in progress // 5 - Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1: 
                    System.out.println("Enter task's name: ");
                    String taskName = scanner.nextLine();
                    System.out.println("Enter task's description: ");
                    String taskDescription = scanner.nextLine();
                    addTask(taskName, taskDescription);
                    break;
                
                case 2:
                    System.out.println("Enter number of the task you want to delete: ");
                    int index = scanner.nextInt();
                    removeTask(index);
                    break;

                case 3:
                    System.out.println("Enter number of the task you want to mark as completed: ");
                    int completedIdx = scanner.nextInt();
                    markCompleted(completedIdx);
                    break;

                case 4:
                    System.out.println("Enter number of the task you want to mark as in progress: ");
                    int progressIdx = scanner.nextInt();
                    markInProgress(progressIdx);
                    break;
                
                case 5:
                    return;
                
                default: 
                    System.out.println("Choose action");
            }
            
            int counter = 1;
            for(Task task : tasks) {
                System.out.println(counter + ". " + task);
                counter++;
            }
        }
    }
}
