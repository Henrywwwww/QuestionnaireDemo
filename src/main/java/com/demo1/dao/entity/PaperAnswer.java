package com.demo1.dao.entity;

public class PaperAnswer {
    private String id;
    private String paperId;
    private String questionId;
    private String answer;

    @Override
    public String toString() {
        return "PaperAnswer{" +
                "id='" + id + '\'' +
                ", paperId='" + paperId + '\'' +
                ", questionId='" + questionId + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
