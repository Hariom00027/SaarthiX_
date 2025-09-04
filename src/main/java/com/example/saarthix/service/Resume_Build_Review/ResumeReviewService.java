package com.example.saarthix.service.Resume_Build_Review;

import com.example.saarthix.model.Resume_Build_Review.ResumeReview;
import com.example.saarthix.repository.Resume_Build_Review.ResumeReviewRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeReviewService {

    private final ResumeReviewRepository reviewRepository;

    public ResumeReviewService(ResumeReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public ResumeReview submitReview(ResumeReview review) {
        return reviewRepository.save(review);
    }

    public List<ResumeReview> getReviewsForResume(String resumeId) {
        return reviewRepository.findAll()
                .stream()
                .filter(r -> r.getResumeId().equals(resumeId))
                .toList();
    }
}
