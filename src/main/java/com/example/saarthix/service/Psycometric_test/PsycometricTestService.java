package com.example.saarthix.service.Psycometric_test;

import com.example.saarthix.model.Psycometric_test.PsycometricTest;
import com.example.saarthix.repository.Psycometric_test.PsycometricTestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsycometricTestService {

    private final PsycometricTestRepository psycometricTestRepository;

    public PsycometricTestService(PsycometricTestRepository psycometricTestRepository) {
        this.psycometricTestRepository = psycometricTestRepository;
    }

    // Fetch all questions for the test
    public List<PsycometricTest> getAllQuestions() {
        return psycometricTestRepository.findAll();
    }

    // Analyze responses and generate report
    public String analyzeResponses(List<PsycometricTest> responses) {
        String report = generateReport(responses);
        return report;
    }

    private String generateReport(List<PsycometricTest> responses) {
        // Simple dummy logic for report generation
        String strengths = "Strengths: ";
        String weaknesses = "Weaknesses: ";
        for (PsycometricTest response : responses) {
            if (response.getAnswer().equals("Strong")) {
                strengths += response.getQuestion() + ", ";
            } else {
                weaknesses += response.getQuestion() + ", ";
            }
        }
        return strengths + "\n" + weaknesses;
    }

    // Get the review from a human mentor for a given student
    public String getReviewFromMentor(String studentId) {
        // In real implementation, fetch mentor's review for the student
        return "Mentor review for student " + studentId + ": Excellent performance in behavioral analysis.";
    }

    public String getTestResult(String studentId) {
        // In real implementation, fetch test results based on studentId
        return "Test results for student " + studentId + ": Strong in analytical thinking, Weak in social behavior.";
    }
}
