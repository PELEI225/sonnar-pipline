package com.example.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public static void main(String[] args) {
        TodoApp app = new TodoApp();
        app.addTask("Apprendre Java");
        app.addTask("Scanner le code avec SonarQube");

        for (Task task : app.getTasks()) {
            System.out.println(task.getTitle() + " - " + (task.isCompleted() ? "Fait" : "Pas fait"));
        }
    }
}
