package com.example.saarthix.controller.Psycometric_test;

import com.example.saarthix.service.Psycometric_test.PsycometricTestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/psycometric/results")
public class PsycometricTestServiceController {

    private final PsycometricTestService psycometricTestService;

    public PsycometricTestServiceController(PsycometricTestService psycometricTestService) {
        this.psycometricTestService = psycometricTestService;
    }

    @GetMapping("/student/{studentId}")
    public String getTestResult(@PathVariable String studentId) {
        return psycometricTestService.getTestResult(studentId);
    }
}
