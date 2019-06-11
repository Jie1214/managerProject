package com.czj.websocket.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * Created by Jie on 2019/4/19.
 * 处理消息的 handler
 * TextWebSocketFrame 在 netty 中，适用于为 WebSocket 专门处理文本的对象，frame 是消息的载体
 *
 * @AUTHOR JIE
 * @date 2019/4/19
 */
public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    private static final Logger logger = LoggerFactory.getLogger(ChatHandler.class);
    /**
     * 用于记录和管理所有客户端的 channel 所有客户端的一个管理组
     */
    private static ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        // 获取客户端传输过来的内容
        String content = msg.text();
        logger.info("接收到的数据:{}", content);

//        for (Channel channel : clients) {
//            // 这里不允许使用 String 我们需要使用 TextWebSocketFrame 这个载体来刷到客户端
//            channel.writeAndFlush(new TextWebSocketFrame("[服务器在：]" + LocalDateTime.now() + "接收到的消息为：" + content));
//        }


        // 下面的这个方法和上面的 for 是一样的
        clients.writeAndFlush(new TextWebSocketFrame("[服务器在：]" + LocalDateTime.now() + "接收到的消息为：" + content));

    }

    /**
     * 当客户端连接服务端之后（打开链接）
     * 获取客户端的 channel , 并且放到 ChannelGroup 中进行管理
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        logger.info("通道 ID 是:{}", ctx.channel().id().asLongText());
        clients.add(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        // 当出发 handlerRemoved, ChannelGroup 会自动移除对应的客户端的 channel
        // clients.remove(ctx.channel());
        logger.info("》》》》》》客户端断开，对应的长 ID 是:{}", ctx.channel().id().asLongText());
        logger.info("》》》》》》客户端断开，对应的短 ID 是:{}", ctx.channel().id().asShortText());
    }
}
