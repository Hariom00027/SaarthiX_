package com.example.saarthix.repository;

import com.example.saarthix.model.Education;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EducationRepository {

    private final List<Education> educations = new ArrayList<>();

    public EducationRepository() {
        educations.add(new Education(1L, "B.Tech"));
        educations.add(new Education(2L, "M.Tech"));
        educations.add(new Education(3L, "MBA"));
    }

    public List<Education> findAll() { return educations; }

    public Optional<Education> findById(Long id) {
        return educations.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public Education save(Education education) {
        educations.add(education);
        return education;
    }

    public Education update(Long id, Education updatedEducation) {
        Optional<Education> existing = findById(id);
        if (existing.isPresent()) {
            Education edu = existing.get();
            edu.setDegree(updatedEducation.getDegree());
            return edu;
        }
        return null;
    }

    public boolean delete(Long id) {
        return educations.removeIf(e -> e.getId().equals(id));
    }
}
