package com.czj.bean;

import java.io.Serializable;

public class HNotice implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.sender_id
     *
     * @mbg.generated
     */
    private String senderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.fid
     *
     * @mbg.generated
     */
    private String fid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_notice.receiver_id
     *
     * @mbg.generated
     */
    private String receiverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_notice
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.id
     *
     * @return the value of h_notice.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.id
     *
     * @param id the value for h_notice.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.title
     *
     * @return the value of h_notice.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.title
     *
     * @param title the value for h_notice.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.content
     *
     * @return the value of h_notice.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.content
     *
     * @param content the value for h_notice.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.sender_id
     *
     * @return the value of h_notice.sender_id
     *
     * @mbg.generated
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.sender_id
     *
     * @param senderId the value for h_notice.sender_id
     *
     * @mbg.generated
     */
    public void setSenderId(String senderId) {
        this.senderId = senderId == null ? null : senderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.create_time
     *
     * @return the value of h_notice.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.create_time
     *
     * @param createTime the value for h_notice.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.status
     *
     * @return the value of h_notice.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.status
     *
     * @param status the value for h_notice.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.type
     *
     * @return the value of h_notice.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.type
     *
     * @param type the value for h_notice.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.fid
     *
     * @return the value of h_notice.fid
     *
     * @mbg.generated
     */
    public String getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.fid
     *
     * @param fid the value for h_notice.fid
     *
     * @mbg.generated
     */
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_notice.receiver_id
     *
     * @return the value of h_notice.receiver_id
     *
     * @mbg.generated
     */
    public String getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_notice.receiver_id
     *
     * @param receiverId the value for h_notice.receiver_id
     *
     * @mbg.generated
     */
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId == null ? null : receiverId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_notice
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
        sb.append(", content=").append(content);
        sb.append(", senderId=").append(senderId);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", fid=").append(fid);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}