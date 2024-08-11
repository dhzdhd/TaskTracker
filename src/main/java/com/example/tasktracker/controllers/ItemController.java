package com.example.tasktracker.controllers;

import com.example.tasktracker.models.Item;
import com.example.tasktracker.repositories.ItemRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/items/")
public class ItemController {
    private final ItemRepository repository;

    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public List<Item> getAllItems(Model model) {
        return repository.findAll();
    }
    
    @PostMapping("/")
    public Item createItem(@RequestBody Item item) {
        return repository.save(item);
    }
}
