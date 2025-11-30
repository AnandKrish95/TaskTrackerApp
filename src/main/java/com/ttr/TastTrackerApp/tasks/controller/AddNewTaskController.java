package com.ttr.TastTrackerApp.tasks.controller;


import com.ttr.TastTrackerApp.tasks.dto.TaskDto;
import com.ttr.TastTrackerApp.tasks.entity.TaskDataEntity;
import com.ttr.TastTrackerApp.tasks.service.AddNewTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task")
public class AddNewTaskController {
    private final AddNewTaskService addNewTaskService;
    public AddNewTaskController(AddNewTaskService addNewTaskService) {
        this.addNewTaskService = addNewTaskService;
    }



    @PostMapping("/addNewTask")
    public ResponseEntity<TaskDataEntity> addNewTask(@RequestBody TaskDto taskInput) {
        return ResponseEntity.ok(addNewTaskService.addNewTask(taskInput));
    }







}
