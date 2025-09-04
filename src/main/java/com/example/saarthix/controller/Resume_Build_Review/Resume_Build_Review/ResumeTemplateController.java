package com.example.saarthix.controller.Resume_Build_Review;

import com.example.saarthix.model.Resume_Build_Review.ResumeTemplate;
import com.example.saarthix.service.Resume_Build_Review.ResumeTemplateService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class ResumeTemplateController {

    private final ResumeTemplateService templateService;

    public ResumeTemplateController(ResumeTemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping
    public List<ResumeTemplate> getAllTemplates() {
        return templateService.getAllTemplates();
    }

    @PostMapping
    public ResumeTemplate addTemplate(@RequestBody ResumeTemplate template) {
        return templateService.addTemplate(template);
    }
}
