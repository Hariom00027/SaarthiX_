package com.example.saarthix.service.Career_counselling;

import org.springframework.stereotype.Service;

@Service
public class CareerCounsellingService {

    public String getCounsellingByStudent(String studentId) {
        // Dummy logic for fetching counselling request by student
        return "Counselling request for student: " + studentId;
    }

    public String addOrUpdateStudentDetails(String studentDetails) {
        // Dummy logic for adding or updating student details
        return "Student details updated: " + studentDetails;
    }
}
