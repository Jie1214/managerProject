package com.czj.netty;

import com.czj.handler.HelloServerInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by Jie on 2019/4/19.
 * 实现客户端发送一个请求，服务器返回 hello netty
 * @AUTHOR JIE
 * @date 2019/4/19
 */
public class HelloNetty {

    public static void main(String[] args) throws InterruptedException {
        // 主线程组
        // 定义一对线程组,用于接收库护短的连接但是不做任何处理
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // 从线程组
        // 从线程组，老板线程组会把任务丢给他，让手下线程组去做任务
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            // 服务启动类
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            // 设置主从线程组
            serverBootstrap.group(bossGroup, workerGroup)
                             // 设置NIO的双向通道
                             // 定义通道的类型
                            .channel(NioServerSocketChannel.class)
                             // 针对从线程进行处理
                             // 子处理器用于处理 workerGroup 初始化器
                            .childHandler(new HelloServerInitializer());
            // 启动server，并且设置 8088 为启动端口号，同时启动方式为同步
            ChannelFuture channelFuture = serverBootstrap.bind(8088).sync();
            //用于监听关闭的channel，设置同步方式
            channelFuture.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

}
