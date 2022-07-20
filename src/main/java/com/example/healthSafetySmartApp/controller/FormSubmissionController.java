package com.example.healthSafetySmartApp.controller;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import com.example.healthSafetySmartApp.service.FormSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

/**
 * This is the 'controller layer' of my application.
 * This is where I can expose parts of my application through exposing multiple RESTFul API endpoints.
 * The controller class contains logic to construct the view layer of the Spring MVC application.
 * (https://en.wikipedia.org/wiki/Model-view-ontroller).
 * This is done using Thymeleaf, a Java template engine for processing and creating HTML, XML, JS, CSS and text.
 *
 * @Controller annotation marks this class as a controller class
 */
@Controller
public class FormSubmissionController {

    /**
     * Autowired instructs Spring to inject the @bean of type FormSubmissionService
     * This means I do not need to create an instance of the FormSubmissionService class using a constructor with
     * the new keyword.
     */
    @Autowired
    FormSubmissionService formSubmissionService;

    /**
     * GetMapping annotation tells Spring that this endpoint (which can be accessed by going to localhost:8080/submit)
     * is the HTTP method 'GET', which means to retrieve data only.
     * @param model
     * @return
     */
    @GetMapping(value = "/submit")
    public String showForm(Model model) {

        // Instance of the custom entity class 'formSubmission' to represent the data required from users to submit a form
        FormSubmission formSubmission = new FormSubmission();

        // Model represents the UI
        // It is automatically created by Thymeleaf for us, this is why we do not need to create an instance of it.
        // We add the instance of 'formSubmission' above to the model, to capture the user's input.
        model.addAttribute("formSubmission", formSubmission);

        // We add a List containing the form types to the model.
        // This means I do not need to write this information directly in the html (view layer)
        List<String> formTypeList = Arrays.asList("Infection", "Accident", "Incident");
        model.addAttribute("formTypeList", formTypeList);

        // We add a List containing the infection tracking types to the model.
        // This means I do not need to write this information directly in the html (view layer)
        List<String> infectionTrackingTypeList = Arrays.asList(
                "I have tested positive for infection ",
                "I have been in close contact with someone who has tested positive for infection ",
                "A member of my household has been in contact with someone who has tested positive for infection",
                "I have tested negative but I have symptoms of infection"
        );
        model.addAttribute("infectionTrackingTypeList", infectionTrackingTypeList);

        // This means when the a user visits 'localhost:8080/submit', to return a HTML page named
        // 'health_and_safety_form'.
        return "health_and_safety_form";
    }

    /**
     * As both the above and below method share the same method name, the application determines which
     * one to call based by the arguments. This is called 'method overloading'.
     *
     * This method takes the model attribute 'formSubmission', which I defined above with an instance
     * of FormSubmission to capture user's form data.
     *
     * It passes this object to the 'service layer' of my Spring boot application, and returns the HTML
     * page 'submit_success', showing the user all of the info they have submitted.
     * @param formSubmission
     * @return
     */
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("formSubmission") FormSubmission formSubmission) {
        formSubmissionService.processFormByType(formSubmission);
        return "submit_success";
    }
}