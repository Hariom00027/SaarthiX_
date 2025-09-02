package com.example.saarthix.controller;

import com.example.saarthix.model.Education;
import com.example.saarthix.service.EducationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educations")
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public List<Education> getAllEducations() {
        return educationService.getAllEducations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable String id) {
        return educationService.getEducationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Education createEducation(@RequestBody Education education) {
        return educationService.createEducation(education);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Education> updateEducation(@PathVariable String id, @RequestBody Education education) {
        Education updated = educationService.updateEducation(id, education);
        if (updated != null)
            return ResponseEntity.ok(updated);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducation(@PathVariable String id) {
        if (educationService.deleteEducation(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
