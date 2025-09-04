package com.example.saarthix.service.Job_metrics;

import com.example.saarthix.model.Job_metrics.Skill;
import com.example.saarthix.repository.Job_metrics.SkillRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Optional<Skill> getSkillById(String id) {
        return skillRepository.findById(id);
    }

    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public Skill updateSkill(String id, Skill skill) {
        return skillRepository.findById(id)
                .map(existing -> {
                    existing.setName(skill.getName());
                    return skillRepository.save(existing);
                })
                .orElse(null);
    }

    public boolean deleteSkill(String id) {
        if (skillRepository.existsById(id)) {
            skillRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
