package com.example.tasktracker.repositories;

import com.example.tasktracker.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
