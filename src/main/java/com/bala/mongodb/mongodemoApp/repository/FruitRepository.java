package com.bala.mongodb.mongodemoApp.repository;

import com.bala.mongodb.mongodemoApp.model.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FruitRepository extends MongoRepository<Fruit,Integer> {
}
