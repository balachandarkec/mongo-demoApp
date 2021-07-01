package com.bala.mongodb.mongodemoApp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "TBL_Fruit")
public class Fruit {
    @Id
    private int id;
    private String name;


}
