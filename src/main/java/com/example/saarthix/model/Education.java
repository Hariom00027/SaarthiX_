
package com.example.saarthix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "educations")
public class Education {
    @Id
    private String id;
    private String degree;

    public Education() {
    }

    public Education(String id, String degree) {
        this.id = id;
        this.degree = degree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
