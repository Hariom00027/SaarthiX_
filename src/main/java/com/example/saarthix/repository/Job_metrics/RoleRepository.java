package com.example.saarthix.repository.Job_metrics;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.saarthix.model.Job_metrics.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    // You can add custom queries if needed, e.g.
    // List<Role> findByIndustryId(String industryId);
}
