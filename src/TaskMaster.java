import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Supercomp on 24.12.2016.
 */
public class TaskMaster {
    private Manager manager = new Manager();
    private Scanner scanner;


    public void startTaskMaster() {

        System.out.println("Press 1 to add new task: ");
        System.out.println("Press 2 to delete a task:  ");
        System.out.println("Press 3 to show the tasks of an employee:  ");
        System.out.println("Press 4 to show all task");
        System.out.println("Press 5 to change a task:  ");
        System.out.println("Press 6 to go out:  ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                addNewTask();
                break;

            case 2:
                // removeTaks();
                // break;

            case 3:
                //showEmployeesTask();

            case 4:
                //showAllTasks();
            case 5:
                // changeTask();
            case 6:
                manager.startInfo();
        }
    }

    public void addNewTask() {
        Task task = new Task();
        scanner = new Scanner(System.in);
        System.out.println("Please give a name of the employee:    ");
        String userInput = scanner.nextLine();

        for (Employee i : manager.getAllEmployess()) {
            if (userInput.equalsIgnoreCase(i.getName())) {
                task.setEmployee(i);
                scanner = new Scanner(System.in);
                System.out.println("Please give an description for the task:    ");
                task.setTaskDescription(userInput = scanner.nextLine());
                scanner = new Scanner(System.in);
                System.out.println("Please give set a name for the task:    ");
                task.setTaskName(userInput = scanner.nextLine());
                scanner = new Scanner(System.in);
                System.out.println("Please give the Prio for the task:    ");
                task.setTaskPriority(scanner.nextInt());
                scanner = new Scanner(System.in);
                System.out.println("Please give the deadline for the task:    ");
                task.setTastDeadLine(scanner.nextInt());
                i.addTask(task);

            } else {
                System.out.println("There is now employee with such name. Would you like to create an new employee?" +
                        "Y / N");
                scanner = new Scanner(System.in);
                String userChoice = scanner.nextLine();
                if (userChoice.equalsIgnoreCase("Y")) {
                    Employee employee = new Employee();
                    manager.addEmployee(employee);
                } else {
                    startTaskMaster();
                }

            }
        }


    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}



