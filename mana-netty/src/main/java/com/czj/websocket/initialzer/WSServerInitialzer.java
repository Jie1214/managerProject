package com.czj.websocket.initialzer;

import com.czj.websocket.handler.ChatHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * Created by Jie on 2019/4/19.
 *
 * @AUTHOR JIE
 * @date 2019/4/19
 */
public class WSServerInitialzer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ChannelPipeline pipeline = ch.pipeline();

        // webSocket 基于http协议，许哦咦要有http的编解码器
        pipeline.addLast(new HttpServerCodec());
        // 支持大数据流，对写大数据流的支持
        pipeline.addLast(new ChunkedWriteHandler());
        // http 的一个聚合器 对 httpMessage 进行聚合，聚合成FullHttpRequest 或 FullHttpResponse
        // 几乎在 netty 中的编程，都会使用到此 hanler
        pipeline.addLast(new HttpObjectAggregator(1024 * 64));

        // =========================== 以上是用于支持 http 协议 ===========================

        /**
         *  // WebSocket 的一个支持 这是 WebSocket 协议的一个助手类
         *  // /ws 是我们使用的一个路径
         *  // 这是一个服务器针对 WebSocket
         *  // WebSocket服务区处理的协议，用于指定给客户端连接访问的路由: /ws
         *  本 handler 会帮你处理一些繁重复杂的一些事情 会帮你处理一些 握手的一些事 handshaking(close, ping, pong) ping + pong = 心跳
         *  对于 WebSocket 来讲 都是以 frames 进行传输的，不同的数据类型对应的 frames 不同
         */
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));

        // 自定义 handler
        pipeline.addLast(new ChatHandler());
    }

}
