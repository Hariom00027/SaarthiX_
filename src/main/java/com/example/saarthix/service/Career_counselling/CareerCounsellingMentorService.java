package com.example.saarthix.service.Career_counselling;

import org.springframework.stereotype.Service;

@Service
public class CareerCounsellingMentorService {

    public String provideMentorCounselling(String studentId) {
        // Dummy logic for mentor-based counselling
        return "Mentor-based counselling for student: " + studentId;
    }
}
