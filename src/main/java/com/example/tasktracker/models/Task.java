package com.example.tasktracker.models;

import java.util.Date;

import jakarta.persistence.*;

@Table(name = "task")
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "task_seq_gen")
    @SequenceGenerator(name = "task_seq_gen", sequenceName = "task_seq", allocationSize = 1)
    public Long id;
    public String title;
    public String description;
    public Boolean completed;
    public Priority priority;
    public Date dueDate;
    
    public Task(Long id, String title, String description, Boolean completed, Priority priority, Date dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public Task() { }

    public Long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Boolean getCompleted() {
        return completed;
    }
    
    public Priority getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return String.format("Task[id = %d, title = %s, description = %s, completed = %b, priority = %s, dueDate = %s", id, title, description, completed, priority, dueDate.toString());
    }
}
