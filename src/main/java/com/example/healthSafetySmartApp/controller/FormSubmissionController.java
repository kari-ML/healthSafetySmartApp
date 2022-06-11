package com.example.healthSafetySmartApp.controller;

import com.example.healthSafetySmartApp.repository.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormSubmissionController {

    @Autowired
    FormSubmissionService formSubmissionService;

    @PostMapping(value = "/submit")
    public void submitForm(String name, String type) {
        formSubmissionService.processForm(name, type);
    }

}
