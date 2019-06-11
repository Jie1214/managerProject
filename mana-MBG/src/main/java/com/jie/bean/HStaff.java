package com.jie.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class HStaff implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.pinyin
     *
     * @mbg.generated
     */
    private String pinyin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.gender
     *
     * @mbg.generated
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.birthday
     *
     * @mbg.generated
     */
    private String birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.emp_num
     *
     * @mbg.generated
     */
    private String empNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.hiredate
     *
     * @mbg.generated
     */
    private String hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.dept_id
     *
     * @mbg.generated
     */
    private String deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.job
     *
     * @mbg.generated
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.kind
     *
     * @mbg.generated
     */
    private String kind;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.id_num
     *
     * @mbg.generated
     */
    private String idNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.work_type
     *
     * @mbg.generated
     */
    private String workType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.level
     *
     * @mbg.generated
     */
    private String level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.hour_wage
     *
     * @mbg.generated
     */
    private BigDecimal hourWage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.month_wage
     *
     * @mbg.generated
     */
    private BigDecimal monthWage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.bank
     *
     * @mbg.generated
     */
    private String bank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.bank_card_num
     *
     * @mbg.generated
     */
    private String bankCardNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.creater_id
     *
     * @mbg.generated
     */
    private String createrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.modifier_id
     *
     * @mbg.generated
     */
    private String modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.create_time
     *
     * @mbg.generated
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.modify_time
     *
     * @mbg.generated
     */
    private String modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_staff.pic
     *
     * @mbg.generated
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_staff
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.id
     *
     * @return the value of h_staff.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.id
     *
     * @param id the value for h_staff.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.username
     *
     * @return the value of h_staff.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.username
     *
     * @param username the value for h_staff.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.password
     *
     * @return the value of h_staff.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.password
     *
     * @param password the value for h_staff.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.name
     *
     * @return the value of h_staff.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.name
     *
     * @param name the value for h_staff.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.pinyin
     *
     * @return the value of h_staff.pinyin
     *
     * @mbg.generated
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.pinyin
     *
     * @param pinyin the value for h_staff.pinyin
     *
     * @mbg.generated
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.gender
     *
     * @return the value of h_staff.gender
     *
     * @mbg.generated
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.gender
     *
     * @param gender the value for h_staff.gender
     *
     * @mbg.generated
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.birthday
     *
     * @return the value of h_staff.birthday
     *
     * @mbg.generated
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.birthday
     *
     * @param birthday the value for h_staff.birthday
     *
     * @mbg.generated
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.phone
     *
     * @return the value of h_staff.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.phone
     *
     * @param phone the value for h_staff.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.address
     *
     * @return the value of h_staff.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.address
     *
     * @param address the value for h_staff.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.emp_num
     *
     * @return the value of h_staff.emp_num
     *
     * @mbg.generated
     */
    public String getEmpNum() {
        return empNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.emp_num
     *
     * @param empNum the value for h_staff.emp_num
     *
     * @mbg.generated
     */
    public void setEmpNum(String empNum) {
        this.empNum = empNum == null ? null : empNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.hiredate
     *
     * @return the value of h_staff.hiredate
     *
     * @mbg.generated
     */
    public String getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.hiredate
     *
     * @param hiredate the value for h_staff.hiredate
     *
     * @mbg.generated
     */
    public void setHiredate(String hiredate) {
        this.hiredate = hiredate == null ? null : hiredate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.dept_id
     *
     * @return the value of h_staff.dept_id
     *
     * @mbg.generated
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.dept_id
     *
     * @param deptId the value for h_staff.dept_id
     *
     * @mbg.generated
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.job
     *
     * @return the value of h_staff.job
     *
     * @mbg.generated
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.job
     *
     * @param job the value for h_staff.job
     *
     * @mbg.generated
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.kind
     *
     * @return the value of h_staff.kind
     *
     * @mbg.generated
     */
    public String getKind() {
        return kind;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.kind
     *
     * @param kind the value for h_staff.kind
     *
     * @mbg.generated
     */
    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.status
     *
     * @return the value of h_staff.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.status
     *
     * @param status the value for h_staff.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.id_num
     *
     * @return the value of h_staff.id_num
     *
     * @mbg.generated
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.id_num
     *
     * @param idNum the value for h_staff.id_num
     *
     * @mbg.generated
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.work_type
     *
     * @return the value of h_staff.work_type
     *
     * @mbg.generated
     */
    public String getWorkType() {
        return workType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.work_type
     *
     * @param workType the value for h_staff.work_type
     *
     * @mbg.generated
     */
    public void setWorkType(String workType) {
        this.workType = workType == null ? null : workType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.level
     *
     * @return the value of h_staff.level
     *
     * @mbg.generated
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.level
     *
     * @param level the value for h_staff.level
     *
     * @mbg.generated
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.hour_wage
     *
     * @return the value of h_staff.hour_wage
     *
     * @mbg.generated
     */
    public BigDecimal getHourWage() {
        return hourWage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.hour_wage
     *
     * @param hourWage the value for h_staff.hour_wage
     *
     * @mbg.generated
     */
    public void setHourWage(BigDecimal hourWage) {
        this.hourWage = hourWage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.month_wage
     *
     * @return the value of h_staff.month_wage
     *
     * @mbg.generated
     */
    public BigDecimal getMonthWage() {
        return monthWage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.month_wage
     *
     * @param monthWage the value for h_staff.month_wage
     *
     * @mbg.generated
     */
    public void setMonthWage(BigDecimal monthWage) {
        this.monthWage = monthWage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.bank
     *
     * @return the value of h_staff.bank
     *
     * @mbg.generated
     */
    public String getBank() {
        return bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.bank
     *
     * @param bank the value for h_staff.bank
     *
     * @mbg.generated
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.bank_card_num
     *
     * @return the value of h_staff.bank_card_num
     *
     * @mbg.generated
     */
    public String getBankCardNum() {
        return bankCardNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.bank_card_num
     *
     * @param bankCardNum the value for h_staff.bank_card_num
     *
     * @mbg.generated
     */
    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum == null ? null : bankCardNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.creater_id
     *
     * @return the value of h_staff.creater_id
     *
     * @mbg.generated
     */
    public String getCreaterId() {
        return createrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.creater_id
     *
     * @param createrId the value for h_staff.creater_id
     *
     * @mbg.generated
     */
    public void setCreaterId(String createrId) {
        this.createrId = createrId == null ? null : createrId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.modifier_id
     *
     * @return the value of h_staff.modifier_id
     *
     * @mbg.generated
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.modifier_id
     *
     * @param modifierId the value for h_staff.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId == null ? null : modifierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.create_time
     *
     * @return the value of h_staff.create_time
     *
     * @mbg.generated
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.create_time
     *
     * @param createTime the value for h_staff.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.modify_time
     *
     * @return the value of h_staff.modify_time
     *
     * @mbg.generated
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.modify_time
     *
     * @param modifyTime the value for h_staff.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_staff.pic
     *
     * @return the value of h_staff.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_staff.pic
     *
     * @param pic the value for h_staff.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_staff
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", empNum=").append(empNum);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", deptId=").append(deptId);
        sb.append(", job=").append(job);
        sb.append(", kind=").append(kind);
        sb.append(", status=").append(status);
        sb.append(", idNum=").append(idNum);
        sb.append(", workType=").append(workType);
        sb.append(", level=").append(level);
        sb.append(", hourWage=").append(hourWage);
        sb.append(", monthWage=").append(monthWage);
        sb.append(", bank=").append(bank);
        sb.append(", bankCardNum=").append(bankCardNum);
        sb.append(", createrId=").append(createrId);
        sb.append(", modifierId=").append(modifierId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}