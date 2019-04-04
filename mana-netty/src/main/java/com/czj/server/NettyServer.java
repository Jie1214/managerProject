package com.czj.server;

import org.springframework.stereotype.Component;

/**
 * Created by Jie on 2019/4/4.
 *
 * @AUTHOR JIE
 * @date 2019/4/4
 */
@Component
public class NettyServer {

    private Thread handleTerminal2PlatformMsg = null;
    private Thread handlePlatform2TerminalMsg = null;

    /**
     * 启动
     */
    public void start() {
        // 终端向平台发送信息
        handleTerminal2PlatformMsg = new Thread(() -> {
            while(true){

            }
        });

        // 平台向终端发送信息
        handlePlatform2TerminalMsg = new Thread(() -> {
            while(true){

            }
        });

        handleTerminal2PlatformMsg.start();
        handlePlatform2TerminalMsg.start();
    }

    /**
     * 停止
     */
    public void stop(){
    }

}
