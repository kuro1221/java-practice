package com.task;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("test1", false, LocalDate.of(2100,1,1));
        Task task2 = new Task("test2", false, LocalDate.of(2010,1,1));
        TaskBoard taskBoard = new TaskBoard();
        taskBoard.addTask(task1);
        taskBoard.addTask(task2);

        List<Task> taskList = taskBoard.getTaskList();
        for (Task task: taskList) {
            System.out.println(task.getTitle());
        }
    }
}
