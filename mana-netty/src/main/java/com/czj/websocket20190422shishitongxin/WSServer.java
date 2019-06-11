package com.czj.websocket20190422shishitongxin;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by Jie on 2019/4/22.
 *
 * @AUTHOR JIE
 * @date 2019/4/22
 */
public class WSServer {

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup mainGroup = new NioEventLoopGroup();
        EventLoopGroup subGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(mainGroup, subGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(null);

            // 绑定端口并且同步
            ChannelFuture channelFuture = serverBootstrap.bind(8088).sync();

            channelFuture.channel().closeFuture().sync();
        } finally {
            mainGroup.shutdownGracefully();
            subGroup.shutdownGracefully();
        }
    }

}
