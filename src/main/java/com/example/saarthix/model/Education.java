package com.example.saarthix.model;

public class Education {
    private Long id;
    private String degree;

    public Education() {}

    public Education(Long id, String degree) {
        this.id = id;
        this.degree = degree;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }
}
