package com.example.healthSafetySmartApp.controller;

import com.example.healthSafetySmartApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping(value = "/carly")
    public String greetingCarly() {
        return greetingService.carlyGreeting();
    }

    @GetMapping(value = "/mikey")
    public String greetingMikey() {
        return greetingService.mikeyGreeting();
    }

    @PostMapping(value = "/person")
    public String greetingPerson(String name) {
        return greetingService.personGreeting(name);
    }

}