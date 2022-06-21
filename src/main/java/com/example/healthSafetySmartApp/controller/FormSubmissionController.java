package com.example.healthSafetySmartApp.controller;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import com.example.healthSafetySmartApp.repository.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
public class FormSubmissionController {

    @Autowired
    FormSubmissionService formSubmissionService;

    @GetMapping(value = "/register")
    public String showForm(Model model) {

        // Instance of the custom entity class 'formSubmission' to represent exactly that
        FormSubmission formSubmission = new FormSubmission();

        // Model represents the UI
        // We add an instance of 'formSubmission' to the model
        model.addAttribute("formSubmission", formSubmission);

        // We add a List containing the form types to the model
        List<String> formTypeList = Arrays.asList("Infection", "Accident", "Incident");
        model.addAttribute("formTypeList", formTypeList);

        return "register_form";
    }
}
