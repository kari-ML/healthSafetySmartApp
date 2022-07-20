package com.example.healthSafetySmartApp.controller;

import com.example.healthSafetySmartApp.entity.UserAccount;
import com.example.healthSafetySmartApp.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private UserLoginService userLoginService;

    @GetMapping(value = "/login")
    public String showLogin(Model model) {
        UserAccount user = new UserAccount();
        model.addAttribute("user", user);

        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") UserAccount user, Model model) {
        boolean isVerified = userLoginService.loginUser(user);

        if(isVerified) {
            return "home";
        }

        model.addAttribute("logError", "logError");
        return "login";
    }
}
