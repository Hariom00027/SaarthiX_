package com.example.saarthix.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Use the actual MongoDB collection that stores roles
@Document(collection = "roles")
public class Role {

    @Id
    private String id;
    private String name;
    private String industryId;
    private Map<String, Object> skills; // keeps flexibility

    public Role() {}

    public Role(String id, String name, String industryId, Map<String, Object> skills) {
        this.id = id;
        this.name = name;
        this.industryId = industryId;
        this.skills = skills;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getIndustryId() { return industryId; }
    public void setIndustryId(String industryId) { this.industryId = industryId; }

    public Map<String, Object> getSkills() { return skills; }
    public void setSkills(Map<String, Object> skills) { this.skills = skills; }
}
