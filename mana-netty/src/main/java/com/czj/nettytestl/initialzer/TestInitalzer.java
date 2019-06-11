package com.czj.nettytestl.initialzer;

import com.czj.nettytestl.handler.TestHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;


/**
 * Created by Jie on 2019/4/20.
 *
 * @AUTHOR JIE
 * @date 2019/4/20
 */
public class TestInitalzer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new HttpServerCodec());
        pipeline.addLast(new ChunkedWriteHandler());
        pipeline.addLast(new HttpObjectAggregator(1024 * 64));

        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));

        // 自定义 handler
        pipeline.addLast(new TestHandler());
    }
}
