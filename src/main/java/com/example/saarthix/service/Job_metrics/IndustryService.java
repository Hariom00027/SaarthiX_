package com.example.saarthix.service.Job_metrics;

import com.example.saarthix.model.Job_metrics.Industry;
import com.example.saarthix.repository.Job_metrics.IndustryRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IndustryService {

    private final IndustryRepository industryRepository;

    public IndustryService(IndustryRepository industryRepository) {
        this.industryRepository = industryRepository;
    }

    public List<Industry> getAllIndustries() {
        return industryRepository.findAll();
    }

    public Optional<Industry> getIndustryById(String id) {
        return industryRepository.findById(id);
    }

    public Industry createIndustry(Industry industry) {
        return industryRepository.save(industry);
    }

    public Industry updateIndustry(String id, Industry industry) {
        return industryRepository.findById(id)
                .map(existing -> {
                    existing.setName(industry.getName());
                    return industryRepository.save(existing);
                })
                .orElse(null);
    }

    public boolean deleteIndustry(String id) {
        if (industryRepository.existsById(id)) {
            industryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
