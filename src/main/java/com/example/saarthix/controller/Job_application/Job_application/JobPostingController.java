package com.example.saarthix.controller.Job_application;

import com.example.saarthix.model.Job_application.JobPosting;
import com.example.saarthix.service.Job_application.JobPostingService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobPostingController {

    private final JobPostingService jobPostingService;

    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @GetMapping
    public List<JobPosting> getAllJobs() {
        return jobPostingService.getAllJobs();
    }

    @PostMapping
    public JobPosting addJob(@RequestBody JobPosting job) {
        return jobPostingService.addJob(job);
    }
}
