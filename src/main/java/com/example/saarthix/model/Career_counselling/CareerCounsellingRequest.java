package com.example.saarthix.model.Career_counselling;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "career_counselling_requests")
public class CareerCounsellingRequest {

    @Id
    private String id;
    private String studentId;       // ID of the student
    private String name;            // Student's name
    private String educationLevel;  // Education level (e.g., B.Tech, M.Tech)
    private String interests;       // Student's career interests
    private String skills;          // Student's skills
    private String counsellingType; // Type of counselling (AI or Mentor)

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEducationLevel() { return educationLevel; }
    public void setEducationLevel(String educationLevel) { this.educationLevel = educationLevel; }

    public String getInterests() { return interests; }
    public void setInterests(String interests) { this.interests = interests; }

    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }

    public String getCounsellingType() { return counsellingType; }
    public void setCounsellingType(String counsellingType) { this.counsellingType = counsellingType; }
}
