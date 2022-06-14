package com.example.healthSafetySmartApp.controller;

import com.example.healthSafetySmartApp.repository.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FormSubmissionController {

    @Autowired
    FormSubmissionService formSubmissionService;

    @PostMapping(value = "/submit")
    public void submitForm(
            String type,
            String fname,
            String lname,
            String phone,
            String department,
            String campus,
            LocalDate date,
            String description,
            String infectionTracking
    ) {
        formSubmissionService.processForm(
                type,
                fname,
                lname,
                phone,
                department,
                campus,
                date,
                description,
                infectionTracking
        );
    }

}
