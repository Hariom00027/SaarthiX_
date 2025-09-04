package com.example.saarthix.service.Resume_Build_Review;

import com.example.saarthix.model.Resume_Build_Review.Resume;
import com.example.saarthix.repository.Resume_Build_Review.ResumeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

    private final ResumeRepository resumeRepository;

    public ResumeService(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    public Resume createResume(Resume resume) {
        return resumeRepository.save(resume);
    }

    public List<Resume> getResumesByStudent(String studentId) {
        return resumeRepository.findAll()
                .stream()
                .filter(r -> r.getStudentId().equals(studentId))
                .toList();
    }
}
