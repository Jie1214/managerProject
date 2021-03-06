package com.jie.bean;

import java.io.Serializable;

public class HExamQuestion implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_exam_question.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_exam_question.question_id
     *
     * @mbg.generated
     */
    private String questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_exam_question.exam_id
     *
     * @mbg.generated
     */
    private String examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_exam_question.result
     *
     * @mbg.generated
     */
    private String result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_exam_question
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_exam_question.id
     *
     * @return the value of h_exam_question.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_exam_question.id
     *
     * @param id the value for h_exam_question.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_exam_question.question_id
     *
     * @return the value of h_exam_question.question_id
     *
     * @mbg.generated
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_exam_question.question_id
     *
     * @param questionId the value for h_exam_question.question_id
     *
     * @mbg.generated
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_exam_question.exam_id
     *
     * @return the value of h_exam_question.exam_id
     *
     * @mbg.generated
     */
    public String getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_exam_question.exam_id
     *
     * @param examId the value for h_exam_question.exam_id
     *
     * @mbg.generated
     */
    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_exam_question.result
     *
     * @return the value of h_exam_question.result
     *
     * @mbg.generated
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_exam_question.result
     *
     * @param result the value for h_exam_question.result
     *
     * @mbg.generated
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_exam_question
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionId=").append(questionId);
        sb.append(", examId=").append(examId);
        sb.append(", result=").append(result);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}