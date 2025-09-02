package com.example.saarthix.controller;

import com.example.saarthix.model.Skill;
import com.example.saarthix.service.SkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    // GET all skills
    @GetMapping
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }

    // GET skill by ID
    @GetMapping("/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable String id) {
        return skillService.getSkillById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // CREATE a new skill
    @PostMapping
    public Skill createSkill(@RequestBody Skill skill) {
        return skillService.createSkill(skill);
    }

    // UPDATE a skill
    @PutMapping("/{id}")
    public ResponseEntity<Skill> updateSkill(@PathVariable String id, @RequestBody Skill skill) {
        Skill updated = skillService.updateSkill(id, skill);
        if (updated != null)
            return ResponseEntity.ok(updated);
        return ResponseEntity.notFound().build();
    }

    // DELETE a skill
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSkill(@PathVariable String id) {
        if (skillService.deleteSkill(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
