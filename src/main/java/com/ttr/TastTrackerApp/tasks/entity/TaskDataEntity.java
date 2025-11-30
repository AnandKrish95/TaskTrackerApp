package com.ttr.TastTrackerApp.tasks.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "task_data")
public class TaskDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "title")  // Assuming title is unique and serves as an ID here; otherwise use a separate ID field
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "status")
    private String status;


}
