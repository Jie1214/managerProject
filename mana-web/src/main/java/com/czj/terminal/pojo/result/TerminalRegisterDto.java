package com.czj.terminal.pojo.result;

public class TerminalRegisterDto extends BaseDto {

    // 制造商ID
    private String manufacturerId;
    // 终端型号
    private String terminalModel;
    // 车辆标识
    private String vehicleLicense;
    // 车牌颜色(1:蓝色 2:黄色 3:黑色 4:白色 9:其他)
    private byte vehicleColor;
    // 车辆VIN
    private String vehicleVin;
    // 安装省份
    private String vehicleProvince;
    // 安装市县域
    private String vehicleCity;

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getTerminalModel() {
        return terminalModel;
    }

    public void setTerminalModel(String terminalModel) {
        this.terminalModel = terminalModel;
    }

    public String getVehicleLicense() {
        return vehicleLicense;
    }

    public void setVehicleLicense(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }

    public byte getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(byte vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getVehicleVin() {
        return vehicleVin;
    }

    public void setVehicleVin(String vehicleVin) {
        this.vehicleVin = vehicleVin;
    }

    public String getVehicleProvince() {
        return vehicleProvince;
    }

    public void setVehicleProvince(String vehicleProvince) {
        this.vehicleProvince = vehicleProvince;
    }

    public String getVehicleCity() {
        return vehicleCity;
    }

    public void setVehicleCity(String vehicleCity) {
        this.vehicleCity = vehicleCity;
    }
}
