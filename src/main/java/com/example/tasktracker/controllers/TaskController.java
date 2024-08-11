package com.example.tasktracker.controllers;

import com.example.tasktracker.models.Task;
import com.example.tasktracker.repositories.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    private final TaskRepository repository;

    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    @PutMapping
    public Task updateTask(@RequestBody Task task) {
        repository.findById(task.getId()).ifPresentOrElse(_task -> repository.save(task), () -> {
            // Improve error
            throw new Error();
        });
        return task;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllTasks() {
        repository.deleteAll();
    }
}
