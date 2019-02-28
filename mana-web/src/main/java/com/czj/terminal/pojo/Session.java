package com.czj.terminal.pojo;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by levince on 2018/3/21.
 * session作为客户端连接服务器时的存储信息对象
 */
public class Session {

    private static final Logger logger = LoggerFactory.getLogger(Session.class);

    //session的id唯一标识
    private String id;
    //终端号码(车牌号码)
    private String vehicleId;
    //终端是否认证
    private Boolean isAuthenticated = false;
    //当前的流水号为多少，流水号word(16),终端发送一次请求流水号+1
    private int currentFlowId = 0;
    //保存传输的通道
    private Channel channel;
    //最后一次连接的时间缀
    private long lastCommunicateTimeStamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Boolean getAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public int getCurrentFlowId() {
        return currentFlowId;
    }

    public void setCurrentFlowId(int currentFlowId) {
        this.currentFlowId = currentFlowId;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public long getLastCommunicateTimeStamp() {
        return lastCommunicateTimeStamp;
    }

    public void setLastCommunicateTimeStamp(long lastCommunicateTimeStamp) {
        this.lastCommunicateTimeStamp = lastCommunicateTimeStamp;
    }

    //生成id
    public static String buildId(Channel channel){
        return channel.id().asLongText();
    }
    //生成一个session
    public static Session buildSession(Channel channel){
        return buildSession(channel,null);
    }

    public static Session buildSession(Channel channel, String phone) {
        Session session = new Session();
        session.setChannel(channel);
        session.setId(buildId(channel));
        session.setVehicleId(phone);
        session.setLastCommunicateTimeStamp(System.currentTimeMillis());
        logger.info("**建立session的过程中的session:{}"+session);
        return session;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Session other = (Session) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id='" + id + '\'' +
                ", terminalPhone='" + vehicleId + '\'' +
                ", isAuthenticated=" + isAuthenticated +
                ", currentFlowId=" + currentFlowId +
                ", channel=" + channel +
                ", lastCommunicateTimeStamp=" + lastCommunicateTimeStamp +
                '}';
    }

    public synchronized int currentFlowId() {
        if (currentFlowId >= 0xffff)
            currentFlowId = 0;
        return currentFlowId++;
    }

}
