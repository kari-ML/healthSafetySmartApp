package com.example.healthSafetySmartApp.repository;

import org.springframework.stereotype.Service;

@Service
public class FormSubmissionService {

    public void processForm(String name, String type) {
        switch (type) {
            case "Infection":
                infectionFormProcess();
                break;
            case "Incident":
                incidentFormProcess();
                break;
            case "Accident":
                accidentFormProcess();
                break;
            default:
                break;
        }
    }

    private void infectionFormProcess() {
        System.out.println("Infection form submitted");
    }

    private void incidentFormProcess() {
        System.out.println("Incident form submitted");
    }

    private void accidentFormProcess() {
        System.out.println("Accident form submitted");
    }

}
