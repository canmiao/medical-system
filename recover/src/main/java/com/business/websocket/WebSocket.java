package com.business.websocket;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author 池灿淼
 * @date 2020/5/25
 **/
@Component
@ServerEndpoint("/websocket/{pageCode}")
public class WebSocket {

    private static final String loggerName = WebSocket.class.getName();

    //concurrent包的线程安全Map，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
    public static Map<String, List<Session>> electricSocketMap = new ConcurrentHashMap<>();

    public static CopyOnWriteArraySet<WebSocket> webSocketSet = new CopyOnWriteArraySet<>();

    private Session session;

    /**
     * 连接建立成功调用的方法
     *
     * @param session 可选的参数，session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(@PathParam("pageCode") String pageCode, Session session) {
        List<Session> sessions = electricSocketMap.get(pageCode);

        System.out.println(pageCode);

        this.session = session;

        webSocketSet.add(this);

        if (null == sessions) {
            List<Session> sessionList = new ArrayList<>();
            sessionList.add(session);
            electricSocketMap.put(pageCode, sessionList);
        } else {
            sessions.add(session);
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(@PathParam("pageCode") String pageCode, Session session) {

        //从set中删除
        webSocketSet.remove(this);

        if (electricSocketMap.containsKey(pageCode)) {
            electricSocketMap.get(pageCode).remove(session);
        }
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     * @param session 可选的参数
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("websocket received message:" + message);
    }

    /**
     * 发生错误时调用
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
    }

    public void sendMessage(String message) {

        for (WebSocket item : webSocketSet) {
            item.sendMessage(message);
        }

    }

    public void sendMessage1(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }
}

