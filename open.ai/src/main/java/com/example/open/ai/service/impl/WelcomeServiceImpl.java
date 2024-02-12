package com.example.open.ai.service.impl;

import com.example.open.ai.service.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
    @Override
    public String sayHi(String name) {
        return "Hello! " + name;
    }
}
