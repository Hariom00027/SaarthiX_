package com.example.saarthix.controller.Career_counselling;

import com.example.saarthix.service.Career_counselling.CareerCounsellingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/counselling")
public class CareerCounsellingController {

    private final CareerCounsellingService careerCounsellingService;

    public CareerCounsellingController(CareerCounsellingService careerCounsellingService) {
        this.careerCounsellingService = careerCounsellingService;
    }

    @GetMapping("/student/{studentId}")
    public String getCounsellingByStudent(@PathVariable String studentId) {
        return careerCounsellingService.getCounsellingByStudent(studentId);
    }

    @PostMapping("/student")
    public String addOrUpdateStudentDetails(@RequestBody String studentDetails) {
        return careerCounsellingService.addOrUpdateStudentDetails(studentDetails);
    }
}
