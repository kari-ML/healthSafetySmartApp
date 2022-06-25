package com.example.healthSafetySmartApp.service;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import com.example.healthSafetySmartApp.repository.FormSubmissionRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FormSubmissionService {

    private static Logger logger = LoggerFactory.getLogger(FormSubmissionService.class);

    @Autowired
    FormSubmissionRepository formSubmissionRepository;

    public FormSubmissionService(FormSubmissionRepository formSubmissionRepository) {
        this.formSubmissionRepository = formSubmissionRepository;
    }

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
        formSubmissionRepository.save(formSubmission);
    }

    private void incidentFormProcess(FormSubmission formSubmission) {
        logger.info("Processing form type: {} ", formSubmission.getType());

    }

    private void accidentFormProcess(FormSubmission formSubmission) {
        logger.info("Processing form type: {} ", formSubmission.getType());

    }

}
