package com.example.saarthix.repository.Job_metrics;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.saarthix.model.Job_metrics.Skill;

@Repository
public interface SkillRepository extends MongoRepository<Skill, String> {
}
