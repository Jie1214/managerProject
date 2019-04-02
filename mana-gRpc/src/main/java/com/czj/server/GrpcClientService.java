package com.czj.server;

import org.springframework.stereotype.Service;

import java.nio.channels.Channel;

/**
 * Created by Jie on 2019/4/1.
 *
 * @AUTHOR JIE
 * @date 2019/4/1
 */
@Service
public class GrpcClientService {

    @GrpcClient("hello-grpc-server")
    private Channel serverChannel;

    public String hello(String name) {
        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(serverChannel);
        Hello.HelloRequest.Builder builder= Hello.HelloRequest.newBuilder().
                setName("xiaoli");
        Hello.HelloResponse response = stub.hello(builder.build());
        return "{'responseStatus':'"+response.getStatus()+"','result':[]}";

    }
}
