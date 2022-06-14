package com.example.healthSafetySmartApp.repository;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.logging.Logger;

@Slf4j
@Service
public class FormSubmissionService {

    public void processForm(String type, String fname, String lname, String phone, String department, String campus, LocalDate date, String description, String infectionTracking) {
        System.out.println(type + fname + lname + phone + department + campus + date + description + infectionTracking);

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

    private void logFormToConsole() {

    }

}
