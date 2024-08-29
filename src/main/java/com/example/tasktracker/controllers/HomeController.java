package com.example.tasktracker.controllers;

import com.example.tasktracker.models.Task;
import com.example.tasktracker.repositories.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {
    private final TaskRepository repository;

    public HomeController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/home")
    public String home(Model model) {
        var tasks = repository.findAll();
        model.addAttribute("tasks", tasks);
        
        return "home";
    }
    
    @PostMapping("/home")
    public String createTask(Task task, Model model) {
        repository.save(task);
        
        System.out.println(task);
        
        return "redirect:/home";
    }
    
    @DeleteMapping("/home")
    public String deleteAllTasks() {
        repository.deleteAll();
        
        return "fragments :: no-tasks-yet";
    }

    @DeleteMapping("/home/{id}")
    public String deleteTask(@PathVariable Long id) {
        repository.deleteById(id);

        System.out.println("delete called");
        System.out.println(id);

        return "home";
    }
}
