package com.example.saarthix.repository.Career_counselling;

import com.example.saarthix.model.Career_counselling.CareerCounsellingRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CareerCounsellingRepository extends MongoRepository<CareerCounsellingRequest, String> {
    CareerCounsellingRequest findByStudentId(String studentId);
}
