package com.example.saarthix.repository;

import com.example.saarthix.model.Industry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryRepository extends MongoRepository<Industry, String> {
}
