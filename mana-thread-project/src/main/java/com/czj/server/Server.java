package com.czj.server;

import com.czj.handler.ProcessDataHandler;
import com.czj.pojo.basebean.PackageData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Jie on 2019/4/8.
 *
 * @AUTHOR JIE
 * @date 2019/4/8
 */
@Component
public class Server {

    private static final Logger logger = LoggerFactory.getLogger(Server.class);

    @Autowired
    private ProcessDataHandler processDataHandler;

    /**
     * 启动服务
     */
    public void start(){

    }

    /**
     * 关闭服务
     */
    public void stop(){

    }

    /**
     * 终端向平台发送数据
     * @param packageData
     */
    public void handleTerminalMsg(PackageData packageData){
        final PackageData.MsgHeader header = packageData.getMsgHeader();
        logger.info("packageData中的数据：{},消息ID：{}", packageData, header.getMsgId());
        String jsonStr = processDataHandler.bin2JsonRouting(packageData);
        // 发送
    }

    /**
     * 平台向终端发送数据
     * @param phone 手机号
     * @param jsonData 数据信息
     * @param msgId 消息ID
     */
    public void handleBusinessMsg(String phone, String jsonData, int msgId){
        logger.info("消息ID：{}, 手机号：{}, json数据:{}", phone, msgId, jsonData);
        byte[] resuleByte = processDataHandler.Json2binRouting(phone, jsonData, msgId);
        // 发送
    }

}
