package com.example.demo.controller.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint(value = "/client/{userId}/{merchantId}")
@Component
public class MyWebSocket {

    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<MyWebSocket> wsClientMap = new CopyOnWriteArraySet<>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    /**
     * 连接建立成功调用的方法
     * @param session 当前会话session
     */
    @OnOpen
    public void onOpen (@PathParam("userId")String userId,@PathParam("merchantId")Long merchantId, Session session){
        this.session = session;
        wsClientMap.add(this);
        addOnlineCount();
    }

    /**
     * 连接关闭
     */
    @OnClose
    public void onClose (){
        wsClientMap.remove(this);
        subOnlineCount();
    }

    /**
     * 收到客户端消息
     * @param message 客户端发送过来的消息
     * @param session 当前会话session
     * @throws IOException
     */
    @OnMessage
    public void onMessage (@PathParam("userId")String userId,@PathParam("merchantId")Long merchantId,String message, Session session) throws IOException {
        sendMsgToAll(message);
    }

    /**
     * 发生错误
     */
    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }

    /**
     * 给所有客户端群发消息
     * @param message 消息内容
     * @throws IOException
     */
    public void sendMsgToAll(String message) throws IOException {
        for ( MyWebSocket item : wsClientMap ){
            item.session.getBasicRemote().sendText(message);
        }
    }

    public void sendMessage (String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    public static synchronized  int getOnlineCount (){
        return MyWebSocket.onlineCount;
    }

    public static synchronized void addOnlineCount (){
        MyWebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount (){
        MyWebSocket.onlineCount--;
    }

}