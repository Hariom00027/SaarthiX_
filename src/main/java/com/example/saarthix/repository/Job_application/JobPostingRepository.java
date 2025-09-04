package com.example.saarthix.repository.Job_application;

import com.example.saarthix.model.Job_application.JobPosting;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostingRepository extends MongoRepository<JobPosting, String> {}
