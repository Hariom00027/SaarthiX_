package com.example.saarthix.repository.Job_metrics;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.saarthix.model.Job_metrics.Blueprint;

@Repository
public interface BlueprintRepository extends MongoRepository<Blueprint, String> {
}
