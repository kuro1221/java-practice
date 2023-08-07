package com.task;

import java.time.LocalDate;

public class Task {
    private String title;
    private Boolean status;
    private LocalDate deadLine;

    public Task(String title, Boolean status, LocalDate deadLine) {
        this.title = title;
        this.status = status;
        this.deadLine = deadLine;
    }

    public String getTitle() {
        return title;
    }

}