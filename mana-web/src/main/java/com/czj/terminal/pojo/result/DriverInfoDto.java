package com.czj.terminal.pojo.result;

/**
 * @ClassName VehicleDriverDto
 * @Author lee
 * @Time 2018/12/11 18:49.
 */
public class DriverInfoDto extends BaseDto {

    // 状态(0x01驾驶员上班 0x02下班)
    private Integer workStatus;
    // 时间
    private String time;
    // IC卡读取状态(0 成功 1-4失败)
    private Integer icStatus;
    // 驾驶员姓名
    private String driverName;
    // 从业资格证
    private String qualificationCode;
    // 发证机构
    private String CertificationAuthority;
    // 有效时间
    private String validityTime;

    public Integer getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    public Integer getIcStatus() {
        return icStatus;
    }

    public void setIcStatus(Integer icStatus) {
        this.icStatus = icStatus;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getQualificationCode() {
        return qualificationCode;
    }

    public void setQualificationCode(String qualificationCode) {
        this.qualificationCode = qualificationCode;
    }

    public String getCertificationAuthority() {
        return CertificationAuthority;
    }

    public void setCertificationAuthority(String certificationAuthority) {
        CertificationAuthority = certificationAuthority;
    }

    public String getValidityTime() {
        return validityTime;
    }

    public void setValidityTime(String validityTime) {
        this.validityTime = validityTime;
    }
}
