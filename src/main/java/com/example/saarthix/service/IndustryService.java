package com.example.saarthix.service;

import com.example.saarthix.model.Industry;
import com.example.saarthix.repository.IndustryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IndustryService {

    private final IndustryRepository industryRepository;

    public IndustryService(IndustryRepository industryRepository) {
        this.industryRepository = industryRepository;
    }

    public List<Industry> getAllIndustries() { return industryRepository.findAll(); }

    public Optional<Industry> getIndustryById(Long id) { return industryRepository.findById(id); }

    public Industry createIndustry(Industry industry) { return industryRepository.save(industry); }

    public Industry updateIndustry(Long id, Industry industry) { return industryRepository.update(id, industry); }

    public boolean deleteIndustry(Long id) { return industryRepository.delete(id); }
}
