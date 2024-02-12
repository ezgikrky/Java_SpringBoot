package com.example.open.ai.service.impl;

import com.example.open.ai.dto.ChatRequest;
import com.example.open.ai.dto.ChatResponse;
import com.example.open.ai.service.ChatService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChatServiceImpl implements ChatService {

    @Qualifier("openAiRestTemplate")
    private final RestTemplate restTemplate;

    public ChatServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${openai.model}")
    private String MODEL;

    @Value("${openai.api.url}")
    private String URL;

    @Override
    public String sentMessage(String message) {


        ChatRequest request= new ChatRequest(MODEL,message);
        ChatResponse response= restTemplate.postForObject(URL,request,ChatResponse.class);
        return response.getChoice().get(0).getMessage().getContent();
    }
}
