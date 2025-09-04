package com.example.saarthix.controller.Job_application;

import com.example.saarthix.model.Job_application.JobApplication;
import com.example.saarthix.service.Job_application.JobApplicationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @PostMapping
    public JobApplication applyToJob(@RequestBody JobApplication application) {
        return jobApplicationService.applyToJob(application);
    }

    @GetMapping("/student/{studentId}")
    public List<JobApplication> getApplicationsByStudent(@PathVariable String studentId) {
        return jobApplicationService.getApplicationsByStudent(studentId);
    }
}
