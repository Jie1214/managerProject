package com.czj.websocket;

import com.czj.websocket.handler.ChatHandler;
import com.czj.websocket.initialzer.WSServerInitialzer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Jie on 2019/4/19.
 *
 * @AUTHOR JIE
 * @date 2019/4/19
 */
public class WSServer {

    private static final Logger logger = LoggerFactory.getLogger(WSServer.class);


    public static void main(String[] args) throws InterruptedException {
        new WSServer().nettyServer();
    }

    public void nettyServer() throws InterruptedException {
        EventLoopGroup mainGroup = new NioEventLoopGroup();
        EventLoopGroup subGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap server = new ServerBootstrap();
            server.group(mainGroup, subGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new WSServerInitialzer());
            ChannelFuture future = server.bind(8088).sync();
            logger.info("服务启动成功");
            future.channel().closeFuture().sync();
        } finally {
            mainGroup.shutdownGracefully();
            subGroup.shutdownGracefully();
        }
    }

}
