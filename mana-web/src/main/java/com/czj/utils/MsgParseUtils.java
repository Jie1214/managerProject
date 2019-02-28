package com.czj.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * Created by levince on 2018/3/22.
 * msg解析类
 */
public class MsgParseUtils {

    private static final Logger logger = LoggerFactory.getLogger(MsgParseUtils.class);

    public static String parseStringFromBytes(byte[] data, int startIndex, int lenth) {
        String str = MsgParseUtils.parseStringFromBytes(data, startIndex, lenth, null);
        if(str != null){
            str.trim();
        }
        return str;
    }

    public static void main(String[] args) {
        // 31313034303600
        byte[] bt = new byte[43];
        bt[0] = 0x31;
        bt[1] = 0x31;
        bt[2] = 0x30;
        bt[3] = 0x34;
        bt[4] = 0x30;
        bt[5] = 0x36;
        bt[6] = 0x00;
        String s = parseStringFromBytes(bt, 0, bt.length);
        System.out.println(s);

    }

    /**
     * 两个字节数组拼接
     *
     * @param paramArrayOfByte1 字节数组1
     * @param paramArrayOfByte2 字节数组2
     * @return 拼接后的数组
     */
    public static byte[] MergerArray(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2) {
        byte[] arrayOfByte = new byte[paramArrayOfByte1.length + paramArrayOfByte2.length];
        System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramArrayOfByte1.length);
        System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramArrayOfByte1.length, paramArrayOfByte2.length);
        return arrayOfByte;
    }


    /**
     * 处理经纬度
     */
    public static double parseByteToDouble(byte[] data, int startIndex, int length){
        BigDecimal bg = new BigDecimal(String.valueOf(parseToFloat(data,startIndex,length)));
        return bg.doubleValue();
    }

    /**
     * 处理经纬度
     */
    public static float parseToFloat(byte[] data, int startIndex, int length) {
        byte[] tmp = new byte[length];
        System.arraycopy(data, startIndex, tmp, 0, length);
        //byte的范围为-128-127,当bs[i]中的值大于127的时候则数据会溢出,此时需要对这些数据进行特殊处理
        //处理原则:因为bs[i]的值为转换成10进制后的数,例如十六进制DC现在处理后的值为-36，则进行如下处理
        //对-36取绝对值，然后减一，然后异或127，最后补出溢出位即加128.负数的话进行如下操作tmp[2] & 0xFF即可。

        int r0 = 0;
        int r1 = 0;

        if (length == 4) {
            r0 = (tmp[3] & 0xFF);
            r1 = (tmp[2] & 0xFF)<< 8;
        }

        int r2=(tmp[1] & 0xFF)<< 16;
        int r3=(tmp[0] & 0xFF)<< 24;
        return (float)(r0 + r1 + r2 + r3)/1000000;
        //(double)((((tmp[0] & 0xFF) << 24) + ((tmp[1] & 0xFF) << 16) + ((tmp[2] & 0xFF) << 8) + (tmp[3] & 0xFF))/1000000);
    }

    public static String parseStringFromBytes(byte[] data, int startIndex, int lenth, String defaultVal) {
        try {
            byte[] tmp = new byte[lenth];
            System.arraycopy(data, startIndex, tmp, 0, lenth);
            if (tmp.length > 0) {
                int i = tmp.length - 1;
                for ( ; i >= 0; i--) {
                    if (tmp[i] != 00) {
                        break;
                    }
                }
                if (i > 0) {
                    tmp = new byte[i + 1];
                    System.arraycopy(data, startIndex, tmp, 0, i + 1);
                }
            }
            return new String(tmp);
        } catch (Exception e) {
            logger.error("解析字符串出错:{}", e.getMessage());
            e.printStackTrace();
            return defaultVal;
        }
    }

    public static String parseBcdStringFromBytes(byte[] data, int startIndex, int lenth) {
        return MsgParseUtils.parseBcdStringFromBytes(data, startIndex, lenth, null);
    }

    public static String parseBcdStringFromBytes(byte[] data, int startIndex, int lenth, String defaultVal) {
        try {
            byte[] tmp = new byte[lenth];
            System.arraycopy(data, startIndex, tmp, 0, lenth);
            return BCD8421Operater.bcd2String(tmp);
        } catch (Exception e) {
            logger.error("解析BCD(8421码)出错:{}", e.getMessage());
            e.printStackTrace();
            return defaultVal;
        }
    }

    public static int parseIntFromBytes(byte[] data, int startIndex, int length) {
        return MsgParseUtils.parseIntFromBytes(data, startIndex, length, 0);
    }


    public static int parseIntFromBytes(byte[] data, int startIndex, int length, int defaultVal) {
        try {
            // 字节数大于4,从起始索引开始向后处理4个字节,其余超出部分丢弃
            final int len = length > 4 ? 4 : length;
            byte[] tmp = new byte[len];
            System.arraycopy(data, startIndex, tmp, 0, len);
            return BitOperator.byteToInteger(tmp);
        } catch (Exception e) {
            logger.error("解析整数出错:{}", e.getMessage());
            e.printStackTrace();
            return defaultVal;
        }
    }

    //double转为字节数组
    public static byte[] double2Bytes(double d) {
        long value = Double.doubleToRawLongBits(d);
        byte[] byteRet = new byte[8];
        for (int i = 0; i < 8; i++) {
            byteRet[i] = (byte) ((value >> 8 * i) & 0xff);
        }
        return byteRet;
    }




    public static double parseDoubleFromBytes(byte[] data, int startIndex, int length) {
        return parseFloatFromBytes(data, startIndex, length, 0f);
    }

    private static float parseFloatFromBytes(byte[] data, int startIndex, int length, float defaultVal) {
        try {
            // 字节数大于4,从起始索引开始向后处理4个字节,其余超出部分丢弃
            final int len = length > 4 ? 4 : length;
            byte[] tmp = new byte[len];
            System.arraycopy(data, startIndex, tmp, 0, len);
            System.out.println(BitOperator.byte2Float(tmp));
            return BitOperator.byte2Float(tmp);
        } catch (Exception e) {
            logger.error("解析浮点数出错:{}", e.getMessage());
            e.printStackTrace();
            return defaultVal;
        }
    }






    //方向数值转换
    public static String directionTrans(int param){

        if (param > 360 || param < 0)
            return "未知方向";

        int coefficient = 45;
        int d = (param + 20) / coefficient;
        String direction = "";

        switch (d){
            case 0: direction = "正北方向"; break;
            case 1: direction = "东北方向"; break;
            case 2: direction = "正东方向"; break;
            case 3: direction = "东南方向"; break;
            case 4: direction = "正南方向"; break;
            case 5: direction = "西南方向"; break;
            case 6: direction = "正西方向"; break;
            case 7: direction = "西北方向"; break;
            case 8: direction = "正北方向"; break;
            default: direction = "未知方向"; break;
        }

        return direction;
    }


}
