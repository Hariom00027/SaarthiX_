package com.example.saarthix.repository.Student_profiling;

import com.example.saarthix.model.Student_profiling.StudentProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentProfileRepository extends MongoRepository<StudentProfile, String> {
    StudentProfile findByStudentId(String studentId);  // fetch profile by student ID
}
