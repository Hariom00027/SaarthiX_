package com.example.saarthix.controller.Interview_prep;

import com.example.saarthix.model.Interview_prep.InterviewQuestion;
import com.example.saarthix.service.Interview_prep.BtechInterviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/interview/btech")
public class BtechInterviewController {

    private final BtechInterviewService service;

    public BtechInterviewController(BtechInterviewService service) {
        this.service = service;
    }

    @GetMapping("/{branch}")
    public List<InterviewQuestion> getQuestions(@PathVariable String branch) {
        return service.getQuestions(branch);
    }
}
