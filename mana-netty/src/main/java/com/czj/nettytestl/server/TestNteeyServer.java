package com.czj.nettytestl.server;

import com.czj.nettytestl.initialzer.TestInitalzer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by Jie on 2019/4/20.
 * 练习 netty 服务器端代码
 * @AUTHOR JIE
 * @date 2019/4/20
 */
public class TestNteeyServer {

    public static void main(String[] args) {
        new TestNteeyServer().test();
    }

    public void test(){
        // 主线程服务器
        EventLoopGroup bossLoopGroup = new NioEventLoopGroup();
        // 从线程服务器
        EventLoopGroup workLoopGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossLoopGroup, workLoopGroup)
                            .channel(NioServerSocketChannel.class)
                            .childHandler(new TestInitalzer());
            ChannelFuture channelFuture = serverBootstrap.bind(8088).sync();
            System.out.println("服务启动成功！！");
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            System.out.println("发生错误");
        } finally {
            bossLoopGroup.shutdownGracefully();
            workLoopGroup.shutdownGracefully();
        }

    }

}
