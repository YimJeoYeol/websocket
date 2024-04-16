package com.exam.sample;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message){
        System.out.println("Received message: " + message.getPayload());

        try {
            session.sendMessage(new TextMessage("Hello Client!"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}