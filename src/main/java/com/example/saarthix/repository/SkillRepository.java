package com.example.saarthix.repository;

import com.example.saarthix.model.Skill;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SkillRepository {

    private final List<Skill> skills = new ArrayList<>();

    public SkillRepository() {
        skills.add(new Skill(1L, "Java"));
        skills.add(new Skill(2L, "Python"));
        skills.add(new Skill(3L, "React"));
    }

    public List<Skill> findAll() { return skills; }

    public Optional<Skill> findById(Long id) {
        return skills.stream().filter(s -> s.getId().equals(id)).findFirst();
    }

    public Skill save(Skill skill) {
        skills.add(skill);
        return skill;
    }

    public Skill update(Long id, Skill updatedSkill) {
        Optional<Skill> existing = findById(id);
        if (existing.isPresent()) {
            Skill skill = existing.get();
            skill.setName(updatedSkill.getName());
            return skill;
        }
        return null;
    }

    public boolean delete(Long id) {
        return skills.removeIf(s -> s.getId().equals(id));
    }
}
