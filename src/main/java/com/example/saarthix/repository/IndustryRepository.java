package com.example.saarthix.repository;

import com.example.saarthix.model.Industry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class IndustryRepository {

    private final List<Industry> industries = new ArrayList<>();

    public IndustryRepository() {
        industries.add(new Industry(1L, "IT"));
        industries.add(new Industry(2L, "Healthcare"));
        industries.add(new Industry(3L, "Finance"));
    }

    public List<Industry> findAll() { return industries; }

    public Optional<Industry> findById(Long id) {
        return industries.stream().filter(i -> i.getId().equals(id)).findFirst();
    }

    public Industry save(Industry industry) {
        industries.add(industry);
        return industry;
    }

    public Industry update(Long id, Industry updatedIndustry) {
        Optional<Industry> existing = findById(id);
        if (existing.isPresent()) {
            Industry industry = existing.get();
            industry.setName(updatedIndustry.getName());
            return industry;
        }
        return null;
    }

    public boolean delete(Long id) {
        return industries.removeIf(i -> i.getId().equals(id));
    }
}
