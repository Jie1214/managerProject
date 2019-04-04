package com.caj.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jie on 2019/4/3.
 *
 * @AUTHOR JIE
 * @date 2019/4/3
 */
public class JT808MsgIdTcpHandlerBase {

    public static void main(String[] args) {
        color[] str = color.values();

        for(color c : str){
            System.out.println(c.draw());
        }

    }

    private Logger logger = LoggerFactory.getLogger(JT808MsgIdTcpHandlerBase.class);

    /**
     * 路由
     * @param MsgId 消息ID
     * @param dataStr 数据字符串`
     * @param phoneNumber 手机号
     * @return
     */
    public String dataConversion(String MsgId, String dataStr, String phoneNumber) {
        String res = "";
        switch (MsgId) {
            case "0x0001":
                res = Msg0x0001(MsgId, dataStr, phoneNumber);
                break;
        }
        return res;
    }

    /**
     * 调用 C# 解析服务的方法
     * @param MsgId 消息Id
     * @param dataStr 数据字符串 要么是json要么是二进制数据
     * @return
     */
    public String analysisServer(String MsgId, String dataStr){
        // 解析方法
        return null;
    }

    /**
     * 具体实现方法
     * @param MsgId
     * @param dataStr
     * @param phoneNumber
     */
    public String Msg0x0001(String MsgId, String dataStr, String phoneNumber){
        // 解析将数据处理称为我可以处理的数据
        String analysisData =  analysisServer(MsgId, dataStr);
        // 打印日志
        logger.info("解析数据:{}", analysisData);
        // 返回数据
        return analysisData;
    }
}

interface Idarw{
    /**
     *
     * @return
     */
    String draw();
}

enum color implements Idarw{
    RED{
        @Override
        public String draw() {
            return "这是红色";
        }
    },GREEN{
        @Override
        public String draw() {
            return "这是绿色";
        }
    },BLUE {
        @Override
        public String draw() {
            return "这是蓝色";
        }
    },BLACK {
        @Override
        public String draw() {
            return "这是黑色";
        }
    };


}

