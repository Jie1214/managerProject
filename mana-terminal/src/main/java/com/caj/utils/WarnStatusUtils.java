package com.caj.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName WarnStatusUtils
 * @Author lee
 * @Time 2018/11/14 10:34.
 */
// 解析定位数据中报警和状态信息
public class WarnStatusUtils {

    private static final Logger logger = LoggerFactory.getLogger(WarnStatusUtils.class);

    public static void main(String[] args) {
        String statusStr = getStatusInfoStr("00000000000011000000000000000010");
        String warnInfoStr = getWarnInfoStr("00000000000011000000000000000001");
        System.out.println(warnInfoStr);
        System.out.println(statusStr);
    }



    // 将报警信息转为报警字符串
    public static String getStatusInfoStr(String status){
        char[] statusChar = new char[0];
        if (StringUtils.isNotBlank(status)) {
            statusChar = status.toCharArray();
        }
        if (statusChar.length == 32) {
            int length = statusChar.length - 1;
            StringBuffer buffer = new StringBuffer();
            buffer.append(getStatusIdInfo(length - 31, statusChar[31] - '0'));
            buffer.append(getStatusIdInfo(length - 30, statusChar[30] - '0'));
            buffer.append(getStatusIdInfo(length - 27, statusChar[27] - '0'));
            return buffer.toString();
        } else {
            logger.info("状态数据格式有误!");
            return "";
        }
    }

    // 将报警信息转为报警字符串
    public static String getWarnInfoStr(String warning){
        char[] warnChar = new char[0];
        if (StringUtils.isNotBlank(warning)) {
            warnChar = warning.toCharArray();
        }
        if (warnChar.length == 32) {
            StringBuffer buffer = new StringBuffer();
            int length = warnChar.length - 1;
            for (int i = 0; i <= length; i++) {
                if (warnChar[i] - '0' == 1) {
                    String warnIdInfo = getWarnIdInfo(length - i);
                    if (StringUtils.isNotBlank(warnIdInfo)) {
                        buffer.append(warnIdInfo).append(";");
                    }
                }
            }
            return buffer.toString();
        } else {
            logger.info("报警数据格式有误!");
            return "";
        }
    }

    // 获取报警id对应的信息
    public static String getWarnIdInfo(int index) {
        String warnIdInfo = "";
        switch (index) {
            case 0: warnIdInfo = "紧急报警"; break;
            case 1: warnIdInfo = "超速报警"; break;
            case 2: warnIdInfo = "疲劳报警"; break;
            case 3: warnIdInfo = "危险报警"; break;
            case 4: warnIdInfo = "GNSS模块发生故障"; break;
            case 5: warnIdInfo = "GNSS天线未接或被剪断"; break;
            case 6: warnIdInfo = "GNSS天线短路"; break;
            case 7: warnIdInfo = "终端主电源欠压"; break;
            case 8: warnIdInfo = "终端主电源掉电"; break;
            case 9: warnIdInfo = "终端LCD或显示器故障"; break;
            case 10: warnIdInfo = "TTS模块故障"; break;
            case 11: warnIdInfo = "摄像头故障"; break;
            case 12: warnIdInfo = "道路运输证IC卡模块故障"; break;
            case 13: warnIdInfo = "超速预警"; break;
            case 14: warnIdInfo = "疲劳驾驶预警"; break;
            case 18: warnIdInfo = "当天累计驾驶超时"; break;
            case 19: warnIdInfo = "超时停车"; break;
            case 20: warnIdInfo = "进出区域"; break;
            case 21: warnIdInfo = "进出路线"; break;
            case 22: warnIdInfo = "路线行驶时间不足/过长"; break;
            case 23: warnIdInfo = "路线偏离报警"; break;
            case 24: warnIdInfo = "车辆VSS故障"; break;
            case 25: warnIdInfo = "车辆油量异常"; break;
            case 26: warnIdInfo = "车辆被盗"; break;
            case 27: warnIdInfo = "车辆非法点火"; break;
            case 28: warnIdInfo = "车辆非法位移"; break;
            case 29: warnIdInfo = "碰撞预警"; break;
            case 30: warnIdInfo = "侧翻预警"; break;
            case 31: warnIdInfo = "非法开门报警"; break;
            default: warnIdInfo = "保留报警" + index; break;
        }
        return warnIdInfo;
    }

    // 获取状态id对应的信息
    private static String getStatusIdInfo(int index, int val) {
        String statusIdInfo = "";
        switch (index) {
            case 0: statusIdInfo = val == 0 ? "ACC关;" : "ACC开;"; break;
            case 1: statusIdInfo = val == 0 ? "未定位;" : "定位;"; break;
            case 4: statusIdInfo = val == 0 ? "运营状态;" : "停运状态;"; break;
        }
        return statusIdInfo;
    }

}
