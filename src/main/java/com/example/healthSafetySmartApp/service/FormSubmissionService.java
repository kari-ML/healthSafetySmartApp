package com.example.healthSafetySmartApp.service;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FormSubmissionService {

    private static Logger logger = LoggerFactory.getLogger(FormSubmissionService.class);

    public void processFormByType(FormSubmission formSubmission) {
        logger.info("Form type: {}", formSubmission.getType());

        switch (formSubmission.getType()) {
            case "Infection":
                infectionFormProcess(formSubmission);
                break;
            case "Incident":
                incidentFormProcess(formSubmission);
                break;
            case "Accident":
                accidentFormProcess(formSubmission);
                break;
            default:
                break;
        }
    }

    private void infectionFormProcess(FormSubmission formSubmission) {
        logger.info("Processing form type: {} ", formSubmission.getType());
    }

    private void incidentFormProcess(FormSubmission formSubmission) {
        logger.info("Processing form type: {} ", formSubmission.getType());
    }

    private void accidentFormProcess(FormSubmission formSubmission) {
        logger.info("Processing form type: {} ", formSubmission.getType());
    }

}
