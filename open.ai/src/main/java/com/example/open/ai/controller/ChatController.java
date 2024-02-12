package com.example.open.ai.controller;

import com.example.open.ai.service.ChatService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //newleyip controllerin içine ekler
@RequestMapping("/chat")
public class ChatController {
    private  final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService=chatService;
    }

    @PostMapping("/prompt")
    public String sendMessage(@RequestBody String message){
        return chatService.sentMessage(message);
    }

}
