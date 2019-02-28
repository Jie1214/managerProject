package com.czj.terminal.pojo.socket;


import javax.websocket.Session;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName SocketMap
 * @Author lee
 * @Time 2018/11/26 15:03.
 */
public class WebSocketCompanyManager {

    // sessionMap(sessionId, companyId)
    private ConcurrentHashMap<String, String> sessionHashMap;
    // vehicleMap(companyId, Session)
    private ConcurrentHashMap<String, LinkedList<Session>> companyHashMap;

    public WebSocketCompanyManager() {
        sessionHashMap = new ConcurrentHashMap<>();
        companyHashMap = new ConcurrentHashMap<>();
    }

    public void sendInfo(String companyId, String result) throws IOException {
            LinkedList<Session> companyList = companyHashMap.get(companyId);
            if (companyList != null && companyList.size() > 0) {
                for (int i = 0; i < companyList.size(); i++) {
                    Session session = companyList.get(i);
                    if (session != null && session.isOpen()) {
                        session.getBasicRemote().sendText(result);
                    }
                }
            }
    }

    // 删除监听
    public void removeMonitor(String sessionId) {
        removeFromCompanyMap(sessionId);
        removeFromSessionMap(sessionId);
    }
    // 删除通信map
    public void removeFromSessionMap(String sessionId) {
        sessionHashMap.remove(sessionId);
    }
    // 删除公司map
    public void removeFromCompanyMap(String sessionId) {
//        String companyId = sessionHashMap.get(sessionId);
//        if (StringUtils.isNotBlank(companyId)) {
//            LinkedList<Session> sessionList = companyHashMap.get(companyId);
//            if (sessionList != null && sessionList.size() > 0) {
//                Iterator<Session> iterator = sessionList.iterator();
//                while(iterator.hasNext()) {
//                    Session next = iterator.next();
//                    if (next.getId().equals(sessionId)) {
//                        sessionList.remove();
//                        break;
//                    }
//                }
//                if (sessionList == null || sessionList.size() < 1) {
//                    companyHashMap.remove(companyId);
//                }
//            }
//        }
    }

    // 增加监听
    public void addMonitor(String companyId, Session session) {
        addToCompanyMap(session.getId(), companyId);
        addToSessionMap(companyId, session);
    }

    // 增加到车辆map
    public void addToCompanyMap(String sessionId, String companyId) {
        sessionHashMap.put(sessionId, companyId);
    }
    // 增加到信息map
    public void addToSessionMap(String vehicleId, Session session) {
        LinkedList<Session> sessionList = companyHashMap.get(vehicleId);
        if (sessionList == null || sessionList.size() <= 0) {
            sessionList = new LinkedList<>();
        }
        sessionList.add(session);
        companyHashMap.put(vehicleId, sessionList);
    }


    public ConcurrentHashMap<String, String> getSessionHashMap() {
        return sessionHashMap;
    }

    public void setSessionHashMap(ConcurrentHashMap<String, String> sessionHashMap) {
        this.sessionHashMap = sessionHashMap;
    }

    public ConcurrentHashMap<String, LinkedList<Session>> getCompanyHashMap() {
        return companyHashMap;
    }

    public void setCompanyHashMap(ConcurrentHashMap<String, LinkedList<Session>> companyHashMap) {
        this.companyHashMap = companyHashMap;
    }
}
