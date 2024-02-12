package com.example.open.ai.dto;

import com.example.open.ai.data.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Data //KENDİSİ GETTİR VE SETTİRİ OLUŞTURUR AMA CLASS ÜZERİNDE KONTROLÜ KAYBETTLİK LOMBOK NASIL BİR ŞEY VERİRSE ONA UYAR
@AllArgsConstructor //parametreli constructor oluşturur
@NoArgsConstructor //parametresiz constructor oluşturur.

public class ChatResponse {
    private List<Choice> choices;



    public static class Choice{
        private int index;
        private Message message;


    }
}
