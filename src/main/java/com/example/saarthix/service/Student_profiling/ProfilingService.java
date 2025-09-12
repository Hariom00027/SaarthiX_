package com.example.saarthix.service.Student_profiling;

import com.example.saarthix.model.Student_profiling.StudentProfile;
import com.example.saarthix.repository.Student_profiling.StudentProfileRepository;
import com.example.saarthix.repository.Student_profiling.StudentProfileRepository;

import org.springframework.stereotype.Service;

@Service
public class ProfilingService {

    private final StudentProfileRepository studentProfileRepository;

    public ProfilingService(StudentProfileRepository studentProfileRepository) {
        this.studentProfileRepository = studentProfileRepository;
    }

    public StudentProfile getProfile(String studentId) {
        return studentProfileRepository.findByStudentId(studentId);
    }

    public StudentProfile createOrUpdateProfile(StudentProfile profile) {
        // Generate AI-based profile based on the student's strengths, weaknesses, and other data
        String aiProfile = generateAIProfile(profile);
        profile.setAiGeneratedProfile(aiProfile);

        return studentProfileRepository.save(profile);
    }

    private String generateAIProfile(StudentProfile profile) {
        
        return "AI Generated Profile for " + profile.getName() + ": " +
                "Strengths: " + profile.getStrengths() + ". " +
                "Weaknesses: " + profile.getWeaknesses() + ". " +
                "Skills: " + profile.getSkills() + ".";
    }
}

