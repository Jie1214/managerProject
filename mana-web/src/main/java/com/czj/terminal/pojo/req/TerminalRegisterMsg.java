package com.czj.terminal.pojo.req;

import com.czj.terminal.pojo.PackageData;

import java.util.Arrays;

/**
 * Created by levince on 2018/3/22.
 * 终端注册信息对象的封装
 */
public class TerminalRegisterMsg extends PackageData{

    //消息体
    private TerminalRegInfo terminalRegInfo;

    public TerminalRegisterMsg() {

    }

    public TerminalRegisterMsg(PackageData packageData) {
        this();
        this.channel = packageData.getChannel();
        this.checkSum = packageData.getCheckSum();
        this.msgBodyBytes = packageData.getMsgBodyBytes();
        this.msgHeader = packageData.getMsgHeader();
    }

    public TerminalRegInfo getTerminalRegInfo() {
        return terminalRegInfo;
    }

    public void setTerminalRegInfo(TerminalRegInfo terminalRegInfo) {
        this.terminalRegInfo = terminalRegInfo;
    }

    @Override
    public String toString() {
        return "TerminalRegisterMsg{" +
                "terminalRegInfo=" + terminalRegInfo +
                ", msgHeader=" + msgHeader +
                ", msgBodyBytes=" + Arrays.toString(msgBodyBytes) +
                ", checkSum=" + checkSum +
                ", channel=" + channel +
                '}';
    }

    //注册消息体对象封装
    public static class TerminalRegInfo {
        // 省域ID(WORD),设备安装车辆所在的省域，省域ID采用GB/T2260中规定的行政区划代码6位中前两位
        // 0保留，由平台取默认值
        private int provinceId;
        // 市域ID(WORD) 设备安装车辆所在的市域,市域ID采用GB/T2260中规定的行 政区划代码6位中间两位
        // 0保留，由平台取默认值
        private int cityId;
        // 县域ID(WORD) 设备安装车辆所在的县域,县域ID采用GB/T2260中规定的行 政区划代码6位中后两位
        private int countyId;
        // 制造商ID(BYTE[5]) 5 个字节，终端制造商编码
        private String manufacturerId;
        // 终端型号(BYTE[8]) 八个字节， 此终端型号 由制造商自行定义 位数不足八位的，补空格。
        private String terminalModel;
        // 终端ID(BYTE[7]) 七个字节， 由大写字母 和数字组成， 此终端 ID由制造 商自行定义
        private String terminalId;
        /**
         *
         * 车牌颜色(BYTE) 车牌颜色，按照 JT/T415-2006 的 5.4.12 未上牌时，取值为0<br>
         * 0===未上车牌<br>
         * 1===蓝色<br>
         * 2===黄色<br>
         * 3===黑色<br>
         * 4===白色<br>
         * 9===其他
         */
        private int vehicleColor;

        /**
         * 车辆颜色为0时，表示车辆VIN
         * 否则 ，车牌(STRING) 公安交 通管理部门颁 发的机动车号牌
         */
        private String vehicleNum;

        public int getCountyId() {
            return countyId;
        }

        public void setCountyId(int countyId) {
            this.countyId = countyId;
        }

        public int getProvinceId() {
            return provinceId;
        }

        public void setProvinceId(int provinceId) {
            this.provinceId = provinceId;
        }

        public int getCityId() {
            return cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }

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

        public String getTerminalId() {
            return terminalId;
        }

        public void setTerminalId(String terminalId) {
            this.terminalId = terminalId;
        }

        public int getVehicleColor() {
            return vehicleColor;
        }

        public void setVehicleColor(int vehicleColor) {
            this.vehicleColor = vehicleColor;
        }

        public String getVehicleNum() {
            return vehicleNum;
        }

        public void setVehicleNum(String vehicleNum) {
            this.vehicleNum = vehicleNum;
        }

        @Override
        public String toString() {
            return "TerminalRegInfo{" +
                    "provinceId=" + provinceId +
                    ", cityId=" + cityId +
                    ", manufacturerId='" + manufacturerId + '\'' +
                    ", terminalModel='" + terminalModel + '\'' +
                    ", terminalId='" + terminalId + '\'' +
                    ", vehicleColor=" + vehicleColor +
                    ", vehicleNum='" + vehicleNum + '\'' +
                    '}';
        }
    }
}
