package com.czj.websocket20190422shishitongxin.Initialzel;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * Created by Jie on 2019/4/22.
 *
 * @AUTHOR JIE
 * @date 2019/4/22
 */
public class WSServerInitialzer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        // WebSocket 基于http协议所以说需要有http的编解码器
        pipeline.addLast(new HttpServerCodec());

        // 基于大数据的流
        pipeline.addLast(new ChunkedWriteHandler());
    }

}
