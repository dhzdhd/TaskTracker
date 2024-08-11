package com.example.tasktracker.models;

import java.util.Date;

import jakarta.persistence.*;

enum Priority {
    P1, P2, P3, P4
}

@Entity
public record Task(@Id @GeneratedValue(strategy = GenerationType.AUTO) Long id, String title, String description,
                   Boolean completed, Priority priority, Date dueDate) {
    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Task[id = %d, title = %s, description = %s, completed = %b, priority = %s, dueDate = %s", id, title, description, completed, priority, dueDate.toString());
    }
}
