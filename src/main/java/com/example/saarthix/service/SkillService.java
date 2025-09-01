package com.example.saarthix.service;

import com.example.saarthix.model.Skill;
import com.example.saarthix.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getAllSkills() { return skillRepository.findAll(); }

    public Optional<Skill> getSkillById(Long id) { return skillRepository.findById(id); }

    public Skill createSkill(Skill skill) { return skillRepository.save(skill); }

    public Skill updateSkill(Long id, Skill skill) { return skillRepository.update(id, skill); }

    public boolean deleteSkill(Long id) { return skillRepository.delete(id); }
}
