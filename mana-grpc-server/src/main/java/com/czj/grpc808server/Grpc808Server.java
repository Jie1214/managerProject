package com.czj.grpc808server;

import com.alibaba.fastjson.JSON;
import com.czj.nettyserver.NettyServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.examples.testjsonbin.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Jie on 2019/4/2.
 * grpc 服务端
 * @AUTHOR JIE
 * @date 2019/4/2
 */
public class Grpc808Server extends sequenceGrpc.sequenceImplBase {

    private static final Logger logger = Logger.getLogger(Grpc808Server.class.getName());


//    @Value("${rpcServer.ioThreadNum}")
//    private int ioThreadNum;
//    //内核为此套接口排队的最大连接个数，对于给定的监听套接口，内核要维护两个队列，未链接队列和已连接队列大小总和最大值
//    @Value("${rpcServer.backlog}")
//    private int backlog;
//    @Value("${rpcServer.port}")
    private int port = 20011;

    @Autowired
    private static NettyServer nettyServer = new NettyServer();

    private Server server;

    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new SequenceImpl())
                .build()
                .start();
        logger.info("Server started, listening on "+ port);
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                Grpc808Server.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop(){
        if (server != null){
            server.shutdown();
        }
    }

    /**
     * block 一直到退出程序
     * @throws InterruptedException
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null){
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
//        nettyServer.nettyStart();

        final Grpc808Server server = new Grpc808Server();
        server.start();
        server.blockUntilShutdown();
    }

    /**
     * 实现 定义一个实现服务接口的类
     */
    private class SequenceImpl extends sequenceGrpc.sequenceImplBase {
        /**
         * 重写 json 转 2 进制 方法
         */
        @Override
        public void json2Bin(JsonToBin req, StreamObserver<JsonToBinResult> responseObserver){
            logger.info("已经进入 >> 重写 json 转 2 进制 方法 << {0}");
            System.out.println(JSON.toJSONString(responseObserver));
            System.out.println("重写 json 转 2 进制 方法");
        }
        /**
         * 重写 2 进制 转 json 方法
         */
        @Override
        public void bin2json(binToJson req, StreamObserver<ResultString> responseObserver){
            logger.info("已经进入 >> 重写 2 进制 转 json 方法 << ");

            System.out.println("重写 2 进制 转 json 方法");

        }
    }

}
