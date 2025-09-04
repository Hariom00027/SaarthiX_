package com.example.saarthix.repository.Job_application;

import com.example.saarthix.model.Job_application.JobApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobApplicationRepository extends MongoRepository<JobApplication, String> {}
