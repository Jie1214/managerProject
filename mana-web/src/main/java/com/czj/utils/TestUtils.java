package com.czj.utils;

import java.util.ArrayList;

/**
 * @ClassName TestUtils
 * @Author lee
 * @Time 2018/11/19 19:51.
 */
public class TestUtils {

    public static void main(String[] args) {

//        String num = ;
//
//        String s = "今天天气真好\\u0001";
//
//        byte[] bytes = s.getBytes();
//
//        byte[] b = new byte[bytes.length];
//
//        System.arraycopy(bytes, 0, b, 0, b.length);

        String s1 = new String(toBytes("687474703A2F2F3232302E3139342E34332E3233333A383038302F312E6A706567"));

        System.out.println(s1);

    }


    /**
     * 将16进制字符串转换为byte[]
     *
     * @param str
     * @return
     */
    public static byte[] toBytes(String str) {
        if(str == null || str.trim().equals("")) {
            return new byte[0];
        }

        byte[] bytes = new byte[str.length() / 2];
        for(int i = 0; i < str.length() / 2; i++) {
            String subStr = str.substring(i * 2, i * 2 + 2);
            bytes[i] = (byte) Integer.parseInt(subStr, 16);
        }
        return bytes;
    }

//    public static void main(String[] args) {
//        TerminalUploadLocationDto dto = new TerminalUploadLocationDto();
//        dto.setWarningInfo("00000000000000000000000000000011");
//        dto.setAddress("安徽");
//        dto.setUploadTime(new Date());
//
//        VehicleRedisInfo vehicleRedisInfo = new VehicleRedisInfo();
//        vehicleRedisInfo.setVehicleLicense("");
//
//        dealWarnIndexChangeBusiness(dto, vehicleRedisInfo);
//        System.out.println(vehicleRedisInfo);
//    }

    // 处理报警信息变更业务
//    private static void dealWarnIndexChangeBusiness(TerminalUploadLocationDto dto, VehicleRedisInfo redisInfo) {
//        // 新增的报警
//        List<WarnIndexInfo> alarmSignList = generateAlarmSign(dto);
//        // redis中报警数据
//        WarnInfo warnInfo = redisInfo.getWarnInfo();
//
//        // 有新增的报警
//        if (alarmSignList != null && alarmSignList.size() > 0) {
//            if (warnInfo == null){
//                warnInfo = new WarnInfo();
//                warnInfo.setStartAddress(dto.getAddress());
//                warnInfo.setEndAddress(dto.getAddress());
//                warnInfo.setEndTime(dto.getUploadTime());
//                warnInfo.setStartTime(dto.getUploadTime());
//                warnInfo.setWarnTime(String.valueOf(dto.getUploadTime().getTime()));
//            }
//            // 之前的报警
//            List<WarnIndexInfo> warnList = warnInfo.getWarnList();
//            // 之前有报警
//            if (warnList != null && warnList.size() > 1) {
//                // 维持不变的
//                List<WarnIndexInfo> keepList = new ArrayList<>(warnList);
//                keepList.retainAll(alarmSignList);
//                // 新增的报警和原有的一致
//                if (keepList.size() != warnList.size()) {
//                    if (keepList != null && keepList.size() > 0) {
//                    }
//                    // 新增的
//                    List<WarnIndexInfo> addList = new ArrayList<>(alarmSignList);
//                    addList.removeAll(warnList);
//                    if (addList != null && addList.size() > 0) {
//                        for (int i = 0; i < addList.size(); i++) {
//                            WarnIndexInfo addIndexInfo = addList.get(i);
//                            addIndexInfo.setAddress(dto.getAddress());
//                            addIndexInfo.setUploadTime(dto.getUploadTime());
//                        }
//                    }
//                    // 解除的
//                    List<WarnIndexInfo> removeList = new ArrayList<>(warnList);
//                    removeList.removeAll(alarmSignList);
//                    if (removeList != null && removeList.size() > 0) {
//                    }
//                    // 持续报警的和新增的报警
//                    warnList.removeAll(removeList);
//                    warnList.addAll(addList);
//                } else {
//                    // 新增的报警和原有的一致
//                }
//            } else { // 之前无报警
//                warnList = alarmSignList;
//            }
//            // 更新报警
//            warnInfo.setWarnList(warnList);
//            redisInfo.setWarnInfo(warnInfo);
//        } else {
//            if (warnInfo != null) {
//                // 将该车所有报警状态都置为已处理
//            }
//            // 清空车辆的报警列表
//            redisInfo.setWarnInfo(null);
//        }
//    }
//
//    // 生成上传报警标志对象
//    private static List<WarnIndexInfo> generateAlarmSign(TerminalUploadLocationDto locationDto) {
//        String warningSign = locationDto.getWarningInfo();
//        List<WarnIndexInfo> result = new ArrayList<>();
//        if (!"00000000000000000000000000000000".equals(warningSign)) {
//            byte[] data = StringEncodeUtils.stringToBytes(warningSign);
//            int len = data.length - 1;
//            for (int i = 0; i < data.length; i++) {
//                if (data[i] == 1) {
//                    WarnIndexInfo dto = new WarnIndexInfo();
//                    dto.setWarnIndex(len - i);
//                    dto.setPushStatus(1);
//                    dto.setUploadTime(locationDto.getUploadTime());
//                    dto.setAddress(locationDto.getAddress());
//                    result.add(dto);
//                }
//            }
//        }
//        return result;
//    }

}
