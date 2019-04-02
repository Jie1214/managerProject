package com.czj.grpc808client;

import com.czj.grpc808server.Grpc808Server;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.testjsonbin.sequenceGrpc;
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

    public void greet(String name) {
        logger.info("Will try to greet " + name + " ...");
        Grpc808Server.SequenceImpl request = Grpc808Server.SequenceImpl.newBuilder().setName(name).build();
        Grpc808Server.SequenceImpl response;
        try {
            response = blockingStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());
        logger.info("Greeting: " + response.getMessage());
    }

    public static void main(String[] args) throws InterruptedException {
        Grpc808Client client = new Grpc808Client("127.0.0.1",50051);
        try{
            String user = "world";
            if (args.length > 0){
                user = args[0];
            }
            client.greet(user);
        }finally {
            client.shutdown();
        }
    }


}
