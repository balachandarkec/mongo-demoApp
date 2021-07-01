package com.bala.mongodb.mongodemoApp.controller;

import com.bala.mongodb.mongodemoApp.model.Fruit;
import com.bala.mongodb.mongodemoApp.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {
    @Autowired
    private FruitRepository repo;

    @PostMapping("/add")
    public Fruit saveFruit(@RequestBody Fruit fruit){
        return repo.save(fruit);
    }

    @GetMapping("/all")
    public List<Fruit> getAllFruits(){
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFruit(@PathVariable("id") int id){
        repo.deleteById(id);
        return "Fruit deleted with : "+id;
    }

}
