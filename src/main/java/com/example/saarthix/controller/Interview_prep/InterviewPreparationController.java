package com.example.saarthix.controller.Interview_prep;

import com.example.saarthix.model.Interview_prep.InterviewQuestion;
import com.example.saarthix.service.Interview_prep.InterviewPreparationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interview-prep")
public class InterviewPreparationController {

    private final InterviewPreparationService service;

    public InterviewPreparationController(InterviewPreparationService service) {
        this.service = service;
    }

    // Example: /interview-prep?branch=CSE&subject=Operating%20Systems&topic=Processes&limit=50
    @GetMapping
    public List<InterviewQuestion> getInterviewQuestions(
            @RequestParam String branch,
            @RequestParam(required = false) String subject,
            @RequestParam(required = false) String topic,
            @RequestParam(required = false) Integer limit
    ) {
        return service.getQuestions(branch, subject, topic, limit);
    }
}