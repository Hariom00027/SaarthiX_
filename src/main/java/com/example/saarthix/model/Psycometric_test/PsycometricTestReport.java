package com.example.saarthix.model.Psycometric_test;

public class PsycometricTestReport {

    private String studentId;
    private String strengths;
    private String weaknesses;

    // Constructor, Getters, and Setters
    public PsycometricTestReport(String studentId, String strengths, String weaknesses) {
        this.studentId = studentId;
        this.strengths = strengths;
        this.weaknesses = weaknesses;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
}
