package com.ttr.TastTrackerApp.tasks.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TaskDto {
    private String title;
    private String description;
    private Timestamp updated_timestamp;
    private Timestamp created_timestamp;
    private Timestamp dueDate;
}
