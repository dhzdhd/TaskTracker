package com.example.tasktracker.repositories;

import com.example.tasktracker.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
