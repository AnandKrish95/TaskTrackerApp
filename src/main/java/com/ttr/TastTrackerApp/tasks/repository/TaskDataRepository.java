package com.ttr.TastTrackerApp.tasks.repository;

import com.ttr.TastTrackerApp.tasks.entity.TaskDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDataRepository extends JpaRepository<TaskDataEntity, Integer> {
}
