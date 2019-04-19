package com.czj.nettyserver;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.timeout.IdleStateHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jie on 2019/4/18.
 *
 * @AUTHOR JIE
 * @date 2019/4/18
 */
@Component
public class NettyServer {

    private static final Logger logger = LoggerFactory.getLogger(NettyServer.class);
    private ChannelFuture channelFuture;
    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;

    @Value("${rpcServer.ioThreadNum}")
    private int ioThreadNum = 5;
    //内核为此套接口排队的最大连接个数，对于给定的监听套接口，内核要维护两个队列，未链接队列和已连接队列大小总和最大值
    @Value("${rpcServer.backlog}")
    private int backlog = 1024;
    @Value("${rpcServer.port}")
    private int port = 20011;

    /**
     * 启动
     */
    public void nettyStart() {
        logger.info("Begin To Start RPC Server...");
        bossGroup = new NioEventLoopGroup();
        workerGroup = new NioEventLoopGroup(ioThreadNum);
        logger.info("NettyRPC server listening on port " + port + " and ready for connections...");
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workerGroup);
        serverBootstrap.channel(NioServerSocketChannel.class);
        serverBootstrap.localAddress(8091);
        serverBootstrap.option(ChannelOption.SO_BACKLOG, backlog);
        serverBootstrap.childOption(ChannelOption.SO_KEEPALIVE, true);
        serverBootstrap.childOption(ChannelOption.TCP_NODELAY, true);

        serverBootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
                socketChannel.pipeline()
                        //心跳检测
                        //超过15分钟未收到客户端消息则自动断开客户端连接
                        .addLast("idleStateHandler", new IdleStateHandler(10, 0, 0, TimeUnit.SECONDS))
                        .addLast();
            }
        });
        try {
            // 异步地绑定服务器;调用sync方法阻塞等待直到绑定完成
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();
            // 获取Channel的CloseFuture，并且阻塞当前线程直到它完成
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 优雅的关闭EventLoopGroup，释放所有的资源
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }

    }

    /**
     * 销毁前滞空对象信息
     */
    public void stop() {
        logger.info("Destroy Derver Resources");
        if (null == channelFuture.channel()) {
            logger.error("server channel is null");
        }
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();
        channelFuture.channel().closeFuture().syncUninterruptibly();
        bossGroup = null;
        workerGroup = null;
        channelFuture = null;
    }

    public int getPort() {
        return port;
    }
}
