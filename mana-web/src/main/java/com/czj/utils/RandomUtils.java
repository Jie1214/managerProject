package com.czj.utils;

import java.util.Random;

/**
 * 随机数和字母生成器
 * Created by Jon on 2017/12/27 15:48
 *
 */
public class RandomUtils {

    /**
     * 生成14位的随机数
     * <p>格式为用户自定义</p>
     *
     * @return 毫秒时间戳
     */
    public static String createRandom() {
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 14; i++) {
            result += random.nextInt(10);
        }
        return result;
    }

    public static String create4ByteRandom() {
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += random.nextInt(10);
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(create4ByteRandom());
    }

}
