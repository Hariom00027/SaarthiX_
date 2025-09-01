package com.example.saarthix.controller;

import com.example.saarthix.model.Industry;
import com.example.saarthix.service.IndustryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/industries")
public class IndustryController {

    private final IndustryService industryService;

    public IndustryController(IndustryService industryService) {
        this.industryService = industryService;
    }

    @GetMapping
    public List<Industry> getAllIndustries() {
        return industryService.getAllIndustries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Industry> getIndustryById(@PathVariable Long id) {
        return industryService.getIndustryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Industry createIndustry(@RequestBody Industry industry) {
        return industryService.createIndustry(industry);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Industry> updateIndustry(@PathVariable Long id, @RequestBody Industry industry) {
        Industry updated = industryService.updateIndustry(id, industry);
        if (updated != null) return ResponseEntity.ok(updated);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndustry(@PathVariable Long id) {
        if (industryService.deleteIndustry(id)) return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
