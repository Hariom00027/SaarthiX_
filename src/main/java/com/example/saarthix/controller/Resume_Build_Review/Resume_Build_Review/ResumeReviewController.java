package com.example.saarthix.controller.Resume_Build_Review;

import com.example.saarthix.model.Resume_Build_Review.ResumeReview;
import com.example.saarthix.service.Resume_Build_Review.ResumeReviewService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ResumeReviewController {

    private final ResumeReviewService reviewService;

    public ResumeReviewController(ResumeReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResumeReview submitReview(@RequestBody ResumeReview review) {
        return reviewService.submitReview(review);
    }

    @GetMapping("/resume/{resumeId}")
    public List<ResumeReview> getReviewsForResume(@PathVariable String resumeId) {
        return reviewService.getReviewsForResume(resumeId);
    }
}
