package com.demo1.dao.entity;

public class QuestionEntity {
    private String id;
    private String questionnaireId;
    private String questionType;
    private String questionTitle;
    private Integer questionNum;
    private String mustAnswer;

    private String leftTitle;


    @Override
    public String toString() {
        return "QuestionEntity{" +
                "id='" + id + '\'' +
                ", questionnaireId='" + questionnaireId + '\'' +
                ", questionType='" + questionType + '\'' +
                ", questionTitle='" + questionTitle + '\'' +
                ", questionNum=" + questionNum +
                ", mustAnswer='" + mustAnswer + '\'' +
                ", leftTitle='" + leftTitle + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public Integer getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    public String getMustAnswer() {
        return mustAnswer;
    }

    public void setMustAnswer(String mustAnswer) {
        this.mustAnswer = mustAnswer;
    }

    public String getLeftTitle() { return leftTitle; }

    public void setLeftTitle(String leftTitle) { this.leftTitle = leftTitle; }
}
