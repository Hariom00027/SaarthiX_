package com.example.saarthix.model.Job_metrics;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "industries")
public class Industry {

    @Id
    private String id; // MongoDB uses String for ObjectId
    private String name;

    public Industry() {
    }

    public Industry(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
