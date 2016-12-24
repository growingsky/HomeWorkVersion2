

import java.util.ArrayList;

public class Employee {
    private String name;
    private String position;
    private int salary;

    private ArrayList<Task> tasks = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    }


