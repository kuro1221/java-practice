package com.task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("test1", false, LocalDate.of(2100,1,1));
        TaskBoard taskBoard = new TaskBoard();
        taskBoard.addTask(task);
        System.out.println(task.getTitle());
    }
}
