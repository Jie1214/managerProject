package com.czj.terminal.pojo.socket;

import javax.websocket.Session;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName SocketMap
 * @Author lee
 * @Time 2018/11/26 15:03.
 */
public class WebSocketVehicleManager {

    // sessionMap(sessionId, vehicleList)
    private ConcurrentHashMap<String, List<String>> sessionHashMap;
    // vehicleMap(vehicleId, Session)
    private ConcurrentHashMap<String, LinkedList<Session>> vehicleHashMap;

    public WebSocketVehicleManager() {
        sessionHashMap = new ConcurrentHashMap<>();
        vehicleHashMap = new ConcurrentHashMap<>();
    }

    // 发送消息
    public void sendInfo(String vehicleId, String result) throws IOException {
        LinkedList<Session> vehicleList = vehicleHashMap.get(vehicleId);
        if (vehicleList != null && vehicleList.size() > 0) {
            for (int i = 0; i < vehicleList.size(); i++) {
                Session session = vehicleList.get(i);
                if (session != null && session.isOpen()) {
                    session.getBasicRemote().sendText(result);
                }
            }
        }
    }

    // 删除监听
    public void removeMonitor(String sessionId) {
        removeFromVehicleMap(sessionId);
        removeFromSessionMap(sessionId);
    }
    // 删除通信map
    public void removeFromSessionMap(String sessionId) {
        sessionHashMap.remove(sessionId);
    }
    // 删除车辆map
    public void removeFromVehicleMap(String sessionId) {
        List<String> vehicleList = sessionHashMap.get(sessionId);
        if (vehicleList != null && vehicleList.size() > 0) {
            for (int i = 0; i < vehicleList.size(); i++) {
                LinkedList<Session> sessionList = vehicleHashMap.get(vehicleList.get(i));
                if (sessionList != null && sessionList.size() > 0) {
                    for (int j = 0; j < sessionList.size(); j++) {
                        Session session = sessionList.get(j);
                        if (session.getId().equals(sessionId)) {
                            sessionList.remove(session);
                            if (sessionList == null || sessionList.size() < 1) {
                                vehicleHashMap.remove(vehicleList.get(i));
                            }
                        }
                    }
                }
            }
        }
    }

    // 增加监听
    public void addMonitor(List<String> vehicleList, Session session) {
        addToVehicleMap(session.getId(), vehicleList);
        for (int i = 0; i < vehicleList.size(); i++) {
            addToSessionMap(vehicleList.get(i), session);
        }
    }
    // 增加到车辆map
    public void addToVehicleMap(String sessionId, List<String> vehicleList) {
        sessionHashMap.put(sessionId, vehicleList);
    }
    // 增加到信息map
    public void addToSessionMap(String vehicleId, Session session) {
        LinkedList<Session> sessionList = vehicleHashMap.get(vehicleId);
        if (sessionList == null || sessionList.size() <= 0) {
            sessionList = new LinkedList<>();
        }
        sessionList.add(session);
        vehicleHashMap.put(vehicleId, sessionList);
    }

    public ConcurrentHashMap<String, List<String>> getSessionHashMap() {
        return sessionHashMap;
    }

    public void setSessionHashMap(ConcurrentHashMap<String, List<String>> sessionHashMap) {
        this.sessionHashMap = sessionHashMap;
    }

    public ConcurrentHashMap<String, LinkedList<Session>> getVehicleHashMap() {
        return vehicleHashMap;
    }

    public void setVehicleHashMap(ConcurrentHashMap<String, LinkedList<Session>> vehicleHashMap) {
        this.vehicleHashMap = vehicleHashMap;
    }
}
