package com.example.saarthix.service.Resume_Build_Review;

import com.example.saarthix.model.Resume_Build_Review.ResumeTemplate;
import com.example.saarthix.repository.Resume_Build_Review.ResumeTemplateRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeTemplateService {

    private final ResumeTemplateRepository templateRepository;

    public ResumeTemplateService(ResumeTemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    public List<ResumeTemplate> getAllTemplates() {
        return templateRepository.findAll();
    }

    public ResumeTemplate addTemplate(ResumeTemplate template) {
        return templateRepository.save(template);
    }
}
