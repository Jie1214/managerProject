package com.jie.bean;

import java.io.Serializable;

public class HQuestion implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_question.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_question.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_question.creater_id
     *
     * @mbg.generated
     */
    private String createrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_question.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_question.modifier_id
     *
     * @mbg.generated
     */
    private String modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_question.modify_time
     *
     * @mbg.generated
     */
    private String modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_question.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_question
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_question.id
     *
     * @return the value of h_question.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_question.id
     *
     * @param id the value for h_question.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_question.title
     *
     * @return the value of h_question.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_question.title
     *
     * @param title the value for h_question.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_question.creater_id
     *
     * @return the value of h_question.creater_id
     *
     * @mbg.generated
     */
    public String getCreaterId() {
        return createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_question.creater_id
     *
     * @param createrId the value for h_question.creater_id
     *
     * @mbg.generated
     */
    public void setCreaterId(String createrId) {
        this.createrId = createrId == null ? null : createrId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_question.create_time
     *
     * @return the value of h_question.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_question.create_time
     *
     * @param createTime the value for h_question.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_question.modifier_id
     *
     * @return the value of h_question.modifier_id
     *
     * @mbg.generated
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_question.modifier_id
     *
     * @param modifierId the value for h_question.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId == null ? null : modifierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_question.modify_time
     *
     * @return the value of h_question.modify_time
     *
     * @mbg.generated
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_question.modify_time
     *
     * @param modifyTime the value for h_question.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_question.content
     *
     * @return the value of h_question.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_question.content
     *
     * @param content the value for h_question.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_question
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
        sb.append(", title=").append(title);
        sb.append(", createrId=").append(createrId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifierId=").append(modifierId);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}