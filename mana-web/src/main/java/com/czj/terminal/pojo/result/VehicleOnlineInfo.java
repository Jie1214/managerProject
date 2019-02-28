package com.czj.terminal.pojo.result;

/**
 * @ClassName VehicleOnlineInfo
 * @Author lee
 * @Time 2018/11/9 13:53.
 */
public class VehicleOnlineInfo {

    // 车辆ID
    private String vehicleId;
    // 车牌号码
    private String vehicleLicense;
    // 在线状态
    private int onlineStatus;

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

    public int getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(int onlineStatus) {
        this.onlineStatus = onlineStatus;
    }
}
