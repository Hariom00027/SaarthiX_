package com.example.saarthix.controller.Job_metrics;

import com.example.saarthix.model.Job_metrics.Industry;
import com.example.saarthix.service.Job_metrics.IndustryService;

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
    public ResponseEntity<Industry> getIndustryById(@PathVariable String id) {
        return industryService.getIndustryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Industry createIndustry(@RequestBody Industry industry) {
        return industryService.createIndustry(industry);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Industry> updateIndustry(@PathVariable String id, @RequestBody Industry industry) {
        Industry updated = industryService.updateIndustry(id, industry);
        if (updated != null)
            return ResponseEntity.ok(updated);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndustry(@PathVariable String id) {
        if (industryService.deleteIndustry(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
