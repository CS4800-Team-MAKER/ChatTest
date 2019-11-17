package com.example.websocketdemo.controller;

import com.example.websocketdemo.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
	
	//general
    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //science
    @MessageMapping("/chat.sendMessage2")
    @SendTo("/topic/public2")
    public ChatMessage sendMessage2(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //agriculture
    @MessageMapping("/chat.sendMessage3")
    @SendTo("/topic/public3")
    public ChatMessage sendMessage3(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //business
    @MessageMapping("/chat.sendMessage4")
    @SendTo("/topic/public4")
    public ChatMessage sendMessage4(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //education
    @MessageMapping("/chat.sendMessage5")
    @SendTo("/topic/public5")
    public ChatMessage sendMessage5(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //engineering
    @MessageMapping("/chat.sendMessage6")
    @SendTo("/topic/public6")
    public ChatMessage sendMessage6(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //environmentaldesign
    @MessageMapping("/chat.sendMessage7")
    @SendTo("/topic/public7")
    public ChatMessage sendMessage7(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //hospitality
    @MessageMapping("/chat.sendMessage8")
    @SendTo("/topic/public8")
    public ChatMessage sendMessage8(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    //class
    @MessageMapping("/chat.sendMessage9")
    @SendTo("/topic/public9")
    public ChatMessage sendMessage9(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }
    
    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, 
                               SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }

}
