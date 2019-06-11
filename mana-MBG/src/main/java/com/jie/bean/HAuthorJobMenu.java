package com.jie.bean;

import java.io.Serializable;

public class HAuthorJobMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_author_job_menu.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_author_job_menu.menu_id
     *
     * @mbg.generated
     */
    private String menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_author_job_menu.job_id
     *
     * @mbg.generated
     */
    private String jobId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_author_job_menu.access
     *
     * @mbg.generated
     */
    private String access;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_author_job_menu.creator
     *
     * @mbg.generated
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_author_job_menu.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_author_job_menu.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_author_job_menu
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_author_job_menu.id
     *
     * @return the value of h_author_job_menu.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_author_job_menu.id
     *
     * @param id the value for h_author_job_menu.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_author_job_menu.menu_id
     *
     * @return the value of h_author_job_menu.menu_id
     *
     * @mbg.generated
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_author_job_menu.menu_id
     *
     * @param menuId the value for h_author_job_menu.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_author_job_menu.job_id
     *
     * @return the value of h_author_job_menu.job_id
     *
     * @mbg.generated
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_author_job_menu.job_id
     *
     * @param jobId the value for h_author_job_menu.job_id
     *
     * @mbg.generated
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_author_job_menu.access
     *
     * @return the value of h_author_job_menu.access
     *
     * @mbg.generated
     */
    public String getAccess() {
        return access;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_author_job_menu.access
     *
     * @param access the value for h_author_job_menu.access
     *
     * @mbg.generated
     */
    public void setAccess(String access) {
        this.access = access == null ? null : access.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_author_job_menu.creator
     *
     * @return the value of h_author_job_menu.creator
     *
     * @mbg.generated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_author_job_menu.creator
     *
     * @param creator the value for h_author_job_menu.creator
     *
     * @mbg.generated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_author_job_menu.creator_name
     *
     * @return the value of h_author_job_menu.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_author_job_menu.creator_name
     *
     * @param creatorName the value for h_author_job_menu.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_author_job_menu.create_time
     *
     * @return the value of h_author_job_menu.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_author_job_menu.create_time
     *
     * @param createTime the value for h_author_job_menu.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_author_job_menu
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
        sb.append(", menuId=").append(menuId);
        sb.append(", jobId=").append(jobId);
        sb.append(", access=").append(access);
        sb.append(", creator=").append(creator);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}