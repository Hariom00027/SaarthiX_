package com.example.saarthix.repository.Interview_prep;

import com.example.saarthix.model.Interview_prep.InterviewQuestion;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface InterviewQuestionRepository extends MongoRepository<InterviewQuestion, String> {
    List<InterviewQuestion> findByStream(String stream);
    List<InterviewQuestion> findByStreamAndBranch(String stream, String branch);
}
