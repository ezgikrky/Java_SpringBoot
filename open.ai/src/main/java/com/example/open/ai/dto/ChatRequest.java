package com.example.open.ai.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ChatRequest { //open.ai ye istek atarken bunu kullanacağız.

    private String model; //chatgpt 3.5 versiyonu bunu buraya atacağız
    private List<Message> messages;


    public ChatRequest(String model, String prompt){
        this.model=model;
        this.messages= new ArrayList<>();
        this.messages.add(new Message("user",prompt));


    }
}
