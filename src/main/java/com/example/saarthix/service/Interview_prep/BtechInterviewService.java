package com.example.saarthix.service.Interview_prep;

import com.example.saarthix.model.Interview_prep.InterviewQuestion;
import com.example.saarthix.repository.Interview_prep.InterviewQuestionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BtechInterviewService {
    private final InterviewQuestionRepository repository;

    public BtechInterviewService(InterviewQuestionRepository repository) {
        this.repository = repository;
    }

    public List<InterviewQuestion> getQuestions(String branch) {
        return repository.findByStreamAndBranch("B.Tech", branch);
    }
}

