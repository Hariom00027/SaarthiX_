package com.example.saarthix.model.Student_profiling;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student_profiles")
public class StudentProfile {

    @Id
    private String id;
    private String studentId;
    private String name;
    private String educationLevel;
    private String interests;
    private String skills;
    private String strengths;
    private String weaknesses;
    private String aiGeneratedProfile;  // AI generated profile 

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    public String getAiGeneratedProfile() {
        return aiGeneratedProfile;
    }

    public void setAiGeneratedProfile(String aiGeneratedProfile) {
        this.aiGeneratedProfile = aiGeneratedProfile;
    }
}
