package com.example.saarthix.controller.Resume_Build_Review;

import com.example.saarthix.model.Resume_Build_Review.Resume;
import com.example.saarthix.service.Resume_Build_Review.ResumeService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resumes")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping
    public Resume createResume(@RequestBody Resume resume) {
        return resumeService.createResume(resume);
    }

    @GetMapping("/student/{studentId}")
    public List<Resume> getStudentResumes(@PathVariable String studentId) {
        return resumeService.getResumesByStudent(studentId);
    }
}
