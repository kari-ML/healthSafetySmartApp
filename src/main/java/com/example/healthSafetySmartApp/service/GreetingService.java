package com.example.healthSafetySmartApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String carlyGreeting() {
        return "Hello Carly";
    }

    public String mikeyGreeting() {
        return "Hello Mikey";
    }

    public String personGreeting(String name) {
        return "Hello " + name;
    }

}
