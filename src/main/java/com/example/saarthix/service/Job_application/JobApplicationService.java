package com.example.saarthix.service.Job_application;

import com.example.saarthix.model.Job_application.JobApplication;
import com.example.saarthix.repository.Job_application.JobApplicationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationService(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplication applyToJob(JobApplication application) {
        return jobApplicationRepository.save(application);
    }

    public List<JobApplication> getApplicationsByStudent(String studentId) {
        return jobApplicationRepository.findAll()
                .stream()
                .filter(a -> a.getStudentId().equals(studentId))
                .toList();
    }
}
