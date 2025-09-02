package com.example.saarthix.repository;

import com.example.saarthix.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    // You can add custom queries if needed, e.g.
    // List<Role> findByIndustryId(String industryId);
}
