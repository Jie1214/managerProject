package com.czj.handler;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * Created by Jie on 2019/4/19.
 * 这是一个初始化器，channel注册后，会执行里面的相应的初始化方法
 * @AUTHOR JIE
 * @date 2019/4/19
 */
public class HelloServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        // 通过 SocketChannel 获得 对应的管道
        ChannelPipeline pipeline = channel.pipeline();
        // 通过管道添加 handler
        // HttpServerCodec 是由 netty自己提供的助手类，可以理解为拦截器
        // 当请求到服务端，我们需要做解码，相应到客户端做编码
        pipeline.addLast("HttpServerCodec", new HttpServerCodec());
        // 添加自定义的助手类返回 "hello netty"
        pipeline.addLast("customHandler", new CustomHandler());

    }

}
