package com.czj.handler;

import com.czj.pojo.basebean.PackageData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Jie on 2019/4/8.
 *
 * @AUTHOR JIE
 * @date 2019/4/8
 */
@Component
public class ProcessDataHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProcessDataHandler.class);
    /**
     * 二进制转json服务
     * @return
     */
    public String binaryWithJson(String phone, byte[] bin, Integer msgId){
        return new String(bin);
    }

    /**
     * json转二进制服务
     * @return
     */
    public byte[] binaryWithJson(String phone, String jsonStr, Integer msgId){
        return jsonStr.getBytes();
    }

    /**
     * 路由 终端想平台发送的数据, 二进制转Json, 返回json数据
     * @param packageData
     */
    public String bin2JsonRouting(PackageData packageData){
        String strJson = "";

        final PackageData.MsgHeader header = packageData.getMsgHeader();
        // 消息Id
        int msgId = packageData.getMsgHeader().getMsgId();
        // 消息体
        byte[] msgByteBody = packageData.getMsgBodyBytes();
        // 手机号
        String phone = packageData.getMsgHeader().getPhone();

        switch(msgId){
            case 0x0001:
                logger.info(">>>>>【终端通用应答】,phone={},flowId={}", header.getPhone(), header.getFlowId());
                strJson = msg0x0001(phone, msgByteBody, msgId);
                break;
            default:
                // 其他情况
                logger.error(">>>>>>【未知消息类型】,phone={},msgId={},package={}", header.getPhone(), msgId, packageData);
                break;
        }
        return strJson;
    }

    public String msg0x0001(String phone, byte[] bin, int msgId){
        String result = "";
        result = binaryWithJson(phone, bin, msgId);
        // 二进制转json服务
        return result;
    }

    /**
     * 路由 平台想终端发送的数据,Json转二进制 返回2进制数据
     * @param phone
     * @param jsonData
     * @param msgId
     * @return
     */
    public byte[] Json2binRouting(String phone, String jsonData, int msgId){
        byte[] result = null;
        switch(msgId){
            case 0x0001:
                logger.info("消息Id是:{}, 手机号是:{}", msgId, phone);
                result = msg0x0001(phone, jsonData, msgId);
                break;
            default:
                // 其他情况
                logger.error(">>>>>>【未知消息类型】,phone={},msgId={}", phone, msgId);
                break;
        }
        return result;
    }

    public byte[] msg0x0001(String phone, String jsonData, int msgId){
        byte[] result = null;
        result = binaryWithJson(phone, jsonData, msgId);
        // 二进制转json服务
        return result;
    }




}
