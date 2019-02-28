package com.czj.terminal.pojo.result;

import java.util.Date;

/**
 * @ClassName TerminalRealWarningDto
 * @Author lee
 * @Time 2018/11/16 15:24.
 */
public class TerminalRealWarningDto {
    // 公司ID
    private String companyId;
    // 公司名称
    private String companyName;
    // 车辆ID
    private String vehicleId;
    // 车牌号码
    private String vehicleLicense;
    // 报警index
    private String warnIndex;
    // 报警名称
    private String warnName;
    // 起始时间
    private Date startTime;
    // 起始地址
    private String startAddress;
    // 结束地址
    private String endAddress;
    // 结束时间
    private Date endTime;

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public void setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }

    public String getWarnIndex() {
        return warnIndex;
    }

    public void setWarnIndex(String warnIndex) {
        this.warnIndex = warnIndex;
    }

    public String getWarnName() {
        return warnName;
    }

    public void setWarnName(String warnName) {
        this.warnName = warnName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
