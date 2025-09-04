package com.example.saarthix.repository.Resume_Build_Review;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.saarthix.model.Resume_Build_Review.ResumeReview;

public interface ResumeReviewRepository extends MongoRepository<ResumeReview, String> {
}
