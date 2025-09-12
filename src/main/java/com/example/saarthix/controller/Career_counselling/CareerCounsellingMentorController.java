package com.example.saarthix.controller.Career_counselling;

import com.example.saarthix.service.Career_counselling.CareerCounsellingMentorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/counselling/mentor")
public class CareerCounsellingMentorController {

    private final CareerCounsellingMentorService careerCounsellingMentorService;

    public CareerCounsellingMentorController(CareerCounsellingMentorService careerCounsellingMentorService) {
        this.careerCounsellingMentorService = careerCounsellingMentorService;
    }

    @GetMapping("/{studentId}")
    public String mentorCounselling(@PathVariable String studentId) {
        return careerCounsellingMentorService.provideMentorCounselling(studentId);
    }
}
