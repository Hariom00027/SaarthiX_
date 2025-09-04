package com.example.saarthix.service.Job_application;

import com.example.saarthix.model.Job_application.JobPosting;
import com.example.saarthix.repository.Job_application.JobPostingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobPostingService {

    private final JobPostingRepository jobPostingRepository;

    public JobPostingService(JobPostingRepository jobPostingRepository) {
        this.jobPostingRepository = jobPostingRepository;
    }

    public List<JobPosting> getAllJobs() {
        return jobPostingRepository.findAll();
    }

    public JobPosting addJob(JobPosting job) {
        return jobPostingRepository.save(job);
    }
}
