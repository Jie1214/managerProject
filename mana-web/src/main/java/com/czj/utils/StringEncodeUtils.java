package com.czj.utils;


import java.io.UnsupportedEncodingException;

public class StringEncodeUtils {

    /**
     * <p>字符转自然数, a-z对应0-25</p>
     * @param numStr
     * @return
     */
    public static byte[] stringToBytes(String numStr) {
        byte[] data = new byte[0];
        try {
            data = numStr.getBytes("ASCII");
            for (int i = 0; i < data.length; i++) {
                if (data[i] >= '0' && data[i] <= '9') {
                    data[i] -= '0';
                }

                if (data[i] >= 'A' && data[i] <= 'Z') {
                    data[i] -= 'A';
                }

                if (data[i] >= 'a' && data[i] <= 'z') {
                    data[i] -= 'a';
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return data;
    }


    public static void main(String[] args) throws UnsupportedEncodingException {
        Integer num = 0xFFFFFFF0;


        byte[] bytes = stringToBytes(HexStringUtils.toFullBinaryString(num));
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }

}
