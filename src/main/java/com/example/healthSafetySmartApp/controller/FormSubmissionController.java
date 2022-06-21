package com.example.healthSafetySmartApp.controller;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import com.example.healthSafetySmartApp.repository.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormSubmissionController {

    @Autowired
    FormSubmissionService formSubmissionService;

    @GetMapping(value = "/submit")
    public String showForm(Model model) {

        // Instance of the custom entity class 'formSubmission' to represent exactly that
        FormSubmission formSubmission = new FormSubmission();

        // Model represents the UI
        // We add an instance of 'formSubmission' to the model
        model.addAttribute("formSubmission", formSubmission);

        // We add a List containing the form types to the model
        List<String> formTypeList = Arrays.asList("Infection", "Accident", "Incident");
        model.addAttribute("formTypeList", formTypeList);

        // We add a List containing the infection tracking types to the model
        List<String> infectionTrackingTypeList = Arrays.asList(
                "I have tested positive for infection ",
                "I have been in close contact with someone who has tested positive for infection ",
                "A member of my household has been in contact with someone who has tested positive for infection",
                "I have tested negative but I have symptoms of infection"
        );
        model.addAttribute("infectionTrackingTypeList", infectionTrackingTypeList);

        return "health_and_safety_form";
    }
}
