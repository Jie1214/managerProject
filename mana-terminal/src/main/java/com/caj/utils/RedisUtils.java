package com.caj.utils;

import com.alibaba.fastjson.JSON;
import com.youbang.redis.VehicleRedisInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @ClassName RedisUtils
 * @Author lee
 * @Time 2018/11/8 18:08.
 */
public class RedisUtils {

    private final static Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    public static Integer getIndex(String jsonString) {
        return getVehicleRedisInfo(jsonString).getIndex();
    }

    public static Integer getTid(String jsonString) {
        return getVehicleRedisInfo(jsonString).getTerminalId();
    }

    public static Integer getSid(String jsonString) {
        return getVehicleRedisInfo(jsonString).getServiceId();
    }

    public static Integer getTrid(String jsonString) {
        return getVehicleRedisInfo(jsonString).getTrackId();
    }

    public static String getVehicleLicense(String jsonString) {
        return getVehicleRedisInfo(jsonString).getVehicleLicense();
    }

    public static VehicleRedisInfo getVehicleRedisInfo(String jsonString) {
        VehicleRedisInfo redisInfo = null;
        if (StringUtils.isBlank(jsonString)) {
            logger.error("解析数据错误!");
        } else {
            redisInfo = JSON.parseObject(jsonString, VehicleRedisInfo.class);
        }
        return redisInfo;
    }

    public static Map<Integer, Object> getTempRedisInfo(String jsonString) {
        logger.info(jsonString);
        Map<Integer, Object> result = null;
        if (StringUtils.isBlank(jsonString)) {
            logger.error("解析数据错误!");
        } else {
            result = JSON.parseObject(jsonString, Map.class);
        }
        return result;
    }

    /**
     * <p>生成REDIS主键</p>
     * @param word
     * @return
     */
    public static String generateRedisKey(Object... word) {
        StringBuffer buffer = new StringBuffer();
        if (word != null && word.length > 0) {
            for (int i = 0; i < word.length; i++) {
                buffer.append(word[i]).append(":");
            }
            buffer.deleteCharAt(buffer.length() - 1);
        }
        return buffer.toString();
    }

}
