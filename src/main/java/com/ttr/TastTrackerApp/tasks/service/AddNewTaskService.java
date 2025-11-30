package com.ttr.TastTrackerApp.tasks.service;

import com.ttr.TastTrackerApp.tasks.dto.TaskDto;

import com.ttr.TastTrackerApp.tasks.entity.TaskDataEntity;
import com.ttr.TastTrackerApp.tasks.repository.TaskDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AddNewTaskService {
    private final ModelMapper modelMapper;
    private final TaskDataRepository taskDataRepository;


    private static final Logger log = LogManager.getLogger(AddNewTaskService.class);

    public AddNewTaskService(ModelMapper modelMapper, TaskDataRepository taskDataRepository) {
        this.modelMapper = modelMapper;
        this.taskDataRepository = taskDataRepository;
    }

    public TaskDataEntity addNewTask(TaskDto taskInput) {


        // Map TaskDto to TaskDataEntity
        TaskDataEntity tde = modelMapper.map(taskInput, TaskDataEntity.class);

        // Save the entity
        taskDataRepository.save(tde);

        log.info(tde);
        return tde;
    }

}
