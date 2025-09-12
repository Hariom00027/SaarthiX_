package com.example.saarthix.service.Interview_prep;

import com.example.saarthix.model.Interview_prep.InterviewQuestion;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Service
public class InterviewPreparationService {

    private final MongoTemplate mongoTemplate;

    public InterviewPreparationService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    // Map supported branch keys to collection names
    private static final Map<String, String> BRANCH_COLLECTION = Map.of(
            "CSE", "CSE_question",
            "CIVIL", "Civil_question",
            "MECHANICAL", "Mechanical_question",
            "ELECTRICAL", "Electrical_question",
            "ELECTRONICS", "Electronics_question"
    );

    private String resolveCollection(String branchKey) {
        if (branchKey == null) return null;
        String key = branchKey.trim().toUpperCase(Locale.ROOT);
        return BRANCH_COLLECTION.get(key);
    }

    public List<InterviewQuestion> getQuestions(String branchKey, String subject, String topic, Integer limit) {
        String collection = resolveCollection(branchKey);
        if (collection == null) {
            throw new IllegalArgumentException("Unsupported branch. Use one of: CSE, CIVIL, MECHANICAL, ELECTRICAL, ELECTRONICS");
        }

        int size = (limit == null || limit <= 0 || limit > 100) ? 50 : limit; // default 50, cap 100

        Query q = new Query();
        if (subject != null && !subject.isBlank()) {
            q.addCriteria(Criteria.where("subject").regex("^" + java.util.regex.Pattern.quote(subject) + "$", "i"));
        }
        if (topic != null && !topic.isBlank()) {
            q.addCriteria(Criteria.where("topic").regex("^" + java.util.regex.Pattern.quote(topic) + "$", "i"));
        }

        q.limit(size);
        // Optional: stable ordering by _id descending so newer imports appear first
        q.with(Sort.by(Sort.Direction.DESC, "_id"));

        return mongoTemplate.find(q, InterviewQuestion.class, collection);
    }
}