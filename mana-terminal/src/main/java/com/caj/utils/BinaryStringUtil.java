package com.caj.utils;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lee
 *
 * <p>数值字符串与byte之间转换工具</p>
 *
 * @Time 2018年5月7日14:25:25
 * */
public class BinaryStringUtil {

    public static void main(String[] args) {
        List<String> strings = longStrToCheckList("111");
        System.out.println(strings);
    }

    /**
     * <p>选择列表转长整型</p>
     *
     * @param list 用于复选框选项下标存储 如:{1,2,4,8} = 100010110(倒序)
     * @return
     */
    public static Long checkListToLong(List<Integer> list){
        if(StringUtils.isNotBlank(list)){
            StringBuffer buff = new StringBuffer();
            long temp = 0;
            for(int i = 0; i < list.size(); i++){
                temp = list.get(i);
                if(temp > buff.length()){
                    for(int j = buff.length(); j < temp; j++){
                        buff.insert(0, "0");
                    }
                }
                buff.insert(0, "1");
            }
            return Long.parseLong(buff.toString(),2);
        }
        return 0L;
    }

    /**
     * <p>字符串转选择列表</p>
     *
     * @param tString 复选框选项下标表示 如:11(10进制) = 1011(二进制) = {1,2,4,8}
     * @return
     */
    public static List<String> longStrToCheckList(String tString){
        int len = tString.length() - 1;
        List<String> result = new ArrayList<>();
        for(int i = len; i >= 0; i--){
            if(tString.charAt(i) == '1'){
                result.add(len - i + "");
            }
        }
        return result;
    }

    /**
     * <p>长整型转完整列表</p>
     * @param num
     * @param len
     * @return
     */
    public static List<String> longToList(Long num, int len){
        LinkedList<String> result = new LinkedList<>();

        if (num >> 1 > 0) {
            for (;num > 0; num = num >> 1) {
                result.add(String.valueOf(num & 1));
            }
        }

        for (; result.size() < len;) {
            result.add("0");
        }

        return result;
    }

    /**
     * <p>完整列表转长整型</p>
     * @param list
     * @return
     */
    public static Long listToLong(List<Integer> list){

        Long num = 0L;

        if (list != null && list.size() > 0) {
            num = list.get(list.size() - 1).longValue();

            for (int i = list.size() - 2; i >=0; i--) {
                num <<= 1;
                num += list.get(i).longValue();
            }

        }

        return num;
    }



    /**
     * 按字节截取字符串(区分汉字)
     * @param s         待截取的字符串
     * @param length    截取的长度
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String cutString(String s, int length) throws UnsupportedEncodingException {
        byte[] bytes = s.getBytes("Unicode");
        int n = 0;
        int i = 2;
        for (; i < bytes.length && n < length; i++){
            if (i % 2 == 1){
                n++;
            } else {
                if (bytes[i] != 0){
                    n ++;
                }
            }
        }
        if (i % 2 == 1){
            if (bytes[i - 1] != 0){
                i = i - 1;
            }else{
                i = i + 1;
            }
        }
        return new String(bytes, 0, i, "Unicode");
    }

    public static List<String> byteArrayToList(byte[] bt) {
        List<String> result = new LinkedList<>();
        if (bt.length > 0) {
            for (int i = bt.length - 1; i >= 0; i--) {
                result.add(String.valueOf(bt[i] >>> 7 & 1));
                result.add(String.valueOf(bt[i] >>> 6 & 1));
                result.add(String.valueOf(bt[i] >>> 5 & 1));
                result.add(String.valueOf(bt[i] >>> 4 & 1));
                result.add(String.valueOf(bt[i] >>> 3 & 1));
                result.add(String.valueOf(bt[i] >>> 2 & 1));
                result.add(String.valueOf(bt[i] >>> 1 & 1));
                result.add(String.valueOf(bt[i] & 1));
            }
        }
        return result;
    }

}
