package com.example.saarthix.service.Job_metrics;

import com.example.saarthix.model.Job_metrics.Education;
import com.example.saarthix.repository.Job_metrics.EducationRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EducationService {

    private final EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }

    public Optional<Education> getEducationById(String id) {
        return educationRepository.findById(id);
    }

    public Education createEducation(Education education) {
        return educationRepository.save(education);
    }

    public Education updateEducation(String id, Education education) {
        return educationRepository.findById(id)
                .map(existing -> {
                    existing.setDegree(education.getDegree());
                    return educationRepository.save(existing);
                })
                .orElse(null);
    }

    public boolean deleteEducation(String id) {
        if (educationRepository.existsById(id)) {
            educationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
