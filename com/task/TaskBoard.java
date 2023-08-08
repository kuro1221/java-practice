package com.task;
import java.util.ArrayList;
import java.util.List;

public class TaskBoard {
    private List<Task> taskList = new ArrayList<>();

    public TaskBoard() {
    }

    public void addTask(Task task) {
        taskList.add(task);
    }
}