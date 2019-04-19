package com.czj.grpc808client;

import com.alibaba.fastjson.JSON;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.testjsonbin.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Jie on 2019/4/2.
 * grpc 客户端
 * @AUTHOR JIE
 * @date 2019/4/2
 */
public class Grpc808Client {

    private final ManagedChannel channel;

    private final sequenceGrpc.sequenceBlockingStub blockingStub;
    private static final Logger logger = Logger.getLogger(Grpc808Client.class.getName());

    public Grpc808Client(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext(true)
                .build();

        blockingStub = sequenceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * json 转2进制
     * @param msgId
     * @param msgNum
     * @param terminalPhoneNo
     * @param value
     * @return
     */
    public JsonToBinResult greet(String msgId, String msgNum, String terminalPhoneNo, String value ) {
        JsonToBin request = JsonToBin.newBuilder()
                .setMsgId(msgId)
                .setMsgNum(msgNum)
                .setTerminalPhoneNo(terminalPhoneNo)
                .setValue(value)
                .build();
        JsonToBinResult response = null;
        try {
            response = blockingStub.json2Bin(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
    }
        return response;
    }

    /**
     * 2进制转 json字符串
     * @param msgId
     * @param byteArrayValue bytes 类型的字符串
     * @return
     */
    public String greet(String msgId, String byteArrayValue) {
        binToJson request = binToJson.newBuilder()
                .setMsgId(msgId)
                .setBytesResult(byteArrayValue)
                .build();
        ResultString response = null;
        try {
            response = blockingStub.bin2json(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
        return response.getJsonStr();
    }

    public static void main(String[] args) throws InterruptedException {
        Grpc808Client client = new Grpc808Client("127.0.0.1",20011);

        // 请输入
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);

        String strScanner = sc.nextLine();
        try{
            switch (strScanner){
                case "编码":
                    System.out.println(JSON.toJSONString(client.greet("0x0001", "[1,2,3,4]")));
                    break;
                case "解码":
                    // String msgId, String msgNum, String terminalPhoneNo, String value
                    System.out.println(JSON.toJSONString(client.greet("0x0001", "1", "16604463007", "[1,2,3,4]")));
            }
        }finally {
            client.shutdown();
        }
    }
}
