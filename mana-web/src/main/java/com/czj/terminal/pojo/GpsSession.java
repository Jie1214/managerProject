package com.czj.terminal.pojo;

import io.netty.channel.Channel;

/**
 * Created by levince on 2018/4/26.
 * gps定位信息的储存session
 */
public class GpsSession {

    private String terminalPhone;

    private Channel channel;

    public GpsSession(Channel channel) {
        this.channel = channel;
    }

    public String getTerminalPhone() {
        return terminalPhone;
    }

    public void setTerminalPhone(String terminalPhone) {
        this.terminalPhone = terminalPhone;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
