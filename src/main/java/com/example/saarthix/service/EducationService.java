package com.example.saarthix.service;

import com.example.saarthix.model.Education;
import com.example.saarthix.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationService {

    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getAllEducations() { return educationRepository.findAll(); }

    public Optional<Education> getEducationById(Long id) { return educationRepository.findById(id); }

    public Education createEducation(Education education) { return educationRepository.save(education); }

    public Education updateEducation(Long id, Education education) { return educationRepository.update(id, education); }

    public boolean deleteEducation(Long id) { return educationRepository.delete(id); }
}
