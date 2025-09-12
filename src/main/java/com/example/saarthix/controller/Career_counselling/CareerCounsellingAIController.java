package com.example.saarthix.controller.Career_counselling;

import com.example.saarthix.service.Career_counselling.CareerCounsellingAIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/counselling/ai")
public class CareerCounsellingAIController {

    private final CareerCounsellingAIService careerCounsellingAIService;

    public CareerCounsellingAIController(CareerCounsellingAIService careerCounsellingAIService) {
        this.careerCounsellingAIService = careerCounsellingAIService;
    }

    @GetMapping("/{studentId}")
    public String aiCounselling(@PathVariable String studentId) {
        return careerCounsellingAIService.provideAICounselling(studentId);
    }
}
