package com.example.saarthix.repository.Resume_Build_Review;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.saarthix.model.Resume_Build_Review.ResumeTemplate;

public interface ResumeTemplateRepository extends MongoRepository<ResumeTemplate, String> {
}
