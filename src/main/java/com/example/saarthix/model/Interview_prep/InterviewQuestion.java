package com.example.saarthix.model.Interview_prep;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "interview_questions")
public class InterviewQuestion {

    @Id
    private String id;
    private String stream;   // B.Tech, B.Sc, BCA, B.Com
    private String branch;   // e.g., Computer Science, Commerce
    private String subject;
    private String topic;
    private String question;
    private String answer;

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getStream() { return stream; }
    public void setStream(String stream) { this.stream = stream; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
}
