package com.example.saarthix.controller.Psycometric_test;

import com.example.saarthix.model.Psycometric_test.PsycometricTest;
import com.example.saarthix.service.Psycometric_test.PsycometricTestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/psycometric")
public class PsycometricTestController {

    private final PsycometricTestService psycometricTestService;

    public PsycometricTestController(PsycometricTestService psycometricTestService) {
        this.psycometricTestService = psycometricTestService;
    }

    @GetMapping("/questions")
    public List<PsycometricTest> getAllQuestions() {
        return psycometricTestService.getAllQuestions();
    }

    @PostMapping("/submit")
    public String submitAnswers(@RequestBody List<PsycometricTest> responses) {
        return psycometricTestService.analyzeResponses(responses);
    }

    @PostMapping("/review/{studentId}")
    public String reviewFromMentor(@PathVariable String studentId) {
        return psycometricTestService.getReviewFromMentor(studentId);
    }
}
