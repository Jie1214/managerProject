package com.czj.pojo;

import java.io.Serializable;
import java.util.Date;

public class ChatMsg implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.send_user_id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    private String sendUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.accept_uesr_id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    private String acceptUesrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.msg
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    private String msg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.sign_flag
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    private Integer signFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat_msg.create_time
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chat_msg
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.id
     *
     * @return the value of chat_msg.id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.id
     *
     * @param id the value for chat_msg.id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.send_user_id
     *
     * @return the value of chat_msg.send_user_id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public String getSendUserId() {
        return sendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.send_user_id
     *
     * @param sendUserId the value for chat_msg.send_user_id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.accept_uesr_id
     *
     * @return the value of chat_msg.accept_uesr_id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public String getAcceptUesrId() {
        return acceptUesrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.accept_uesr_id
     *
     * @param acceptUesrId the value for chat_msg.accept_uesr_id
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public void setAcceptUesrId(String acceptUesrId) {
        this.acceptUesrId = acceptUesrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.msg
     *
     * @return the value of chat_msg.msg
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.msg
     *
     * @param msg the value for chat_msg.msg
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.sign_flag
     *
     * @return the value of chat_msg.sign_flag
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public Integer getSignFlag() {
        return signFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.sign_flag
     *
     * @param signFlag the value for chat_msg.sign_flag
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public void setSignFlag(Integer signFlag) {
        this.signFlag = signFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat_msg.create_time
     *
     * @return the value of chat_msg.create_time
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat_msg.create_time
     *
     * @param createTime the value for chat_msg.create_time
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chat_msg
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sendUserId=").append(sendUserId);
        sb.append(", acceptUesrId=").append(acceptUesrId);
        sb.append(", msg=").append(msg);
        sb.append(", signFlag=").append(signFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}