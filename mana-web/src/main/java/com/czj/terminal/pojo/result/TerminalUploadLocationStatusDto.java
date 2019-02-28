package com.czj.terminal.pojo.result;

import java.util.Date;

public class TerminalUploadLocationStatusDto {

    // ACC状态 0: 关 1: 开
    private int accStatus;
    // 0: 未定位 1:定位
    private int location;
    // 0: 北纬 1: 南纬
    private int latitude;
    // 0:东经 1:西经
    private int longitude;
    // 0: 运营状态 1: 停运状态
    private int status;
    // 0: 经纬度未经保密插件加密 1:经纬度已经保密插件加密
    private int encryption;
    // 负载 00:空车 01:半载  10:保留 11:满载
    private int loadStatus;
    // 油路 0:正常 1:断开
    private int oilRoad;
    // 电路 0: 正常 1:断开
    private int circuit;
    // 车锁 0: 解锁 1: 加锁
    private int vehicleLock;
    // 0: 门1关 1: 门1开(前门)
    private int frontDoor;
    // 0: 门2关 1: 门2开(中门)
    private int centerDoor;
    // 0: 门3关 1: 门3开(后门)
    private int backDoor;
    // 0: 门4关 1: 门4开(驾驶席门)
    private int cabDoor;
    // 0: 门5关 1: 门5开(自定义)
    private int customGate;
    // 0: 未使用GPS卫星进行定位 1: 使用GPS卫星进行定位
    private int GPS;
    // 0: 未使用北斗卫星进行定位 1: 使用北斗卫星进行定位
    private int GNSS;
    // 0: 未使用GLONASS卫星进行定位 1: 使用GLONASS卫星进行定位
    private int GLONASS;
    // 0: 未使用Galileo卫星进行定位 1: 使用Galileo卫星进行定位
    private int Galileo;
    // 上传时间
    private Date uploadTime;


    public int getVehicleLock() {
        return vehicleLock;
    }

    public void setVehicleLock(int vehicleLock) {
        this.vehicleLock = vehicleLock;
    }

    public int getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(int accStatus) {
        this.accStatus = accStatus;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEncryption() {
        return encryption;
    }

    public void setEncryption(int encryption) {
        this.encryption = encryption;
    }

    public int getLoadStatus() {
        return loadStatus;
    }

    public void setLoadStatus(int loadStatus) {
        this.loadStatus = loadStatus;
    }

    public int getOilRoad() {
        return oilRoad;
    }

    public void setOilRoad(int oilRoad) {
        this.oilRoad = oilRoad;
    }

    public int getCircuit() {
        return circuit;
    }

    public void setCircuit(int circuit) {
        this.circuit = circuit;
    }

    public int getFrontDoor() {
        return frontDoor;
    }

    public void setFrontDoor(int frontDoor) {
        this.frontDoor = frontDoor;
    }

    public int getCenterDoor() {
        return centerDoor;
    }

    public void setCenterDoor(int centerDoor) {
        this.centerDoor = centerDoor;
    }

    public int getBackDoor() {
        return backDoor;
    }

    public void setBackDoor(int backDoor) {
        this.backDoor = backDoor;
    }

    public int getCabDoor() {
        return cabDoor;
    }

    public void setCabDoor(int cabDoor) {
        this.cabDoor = cabDoor;
    }

    public int getCustomGate() {
        return customGate;
    }

    public void setCustomGate(int customGate) {
        this.customGate = customGate;
    }

    public int getGPS() {
        return GPS;
    }

    public void setGPS(int GPS) {
        this.GPS = GPS;
    }

    public int getGNSS() {
        return GNSS;
    }

    public void setGNSS(int GNSS) {
        this.GNSS = GNSS;
    }

    public int getGLONASS() {
        return GLONASS;
    }

    public void setGLONASS(int GLONASS) {
        this.GLONASS = GLONASS;
    }

    public int getGalileo() {
        return Galileo;
    }

    public void setGalileo(int galileo) {
        Galileo = galileo;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}
