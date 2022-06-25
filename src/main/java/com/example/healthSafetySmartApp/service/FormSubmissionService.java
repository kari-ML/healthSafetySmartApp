package com.example.healthSafetySmartApp.service;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import com.example.healthSafetySmartApp.repository.FormSubmissionRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is the 'service layer' of my application.
 * This is where all of the business logic is stored, which is signalled by the use of the @Service annotation.
 * It does not have any other special function other than that.
 * This annotation also includes @Component, instructing Spring to register this interface as a @Bean and store
 * it inside the ApplicationContext.
 */
@Slf4j
@Service
public class FormSubmissionService {

    private static Logger logger = LoggerFactory.getLogger(FormSubmissionService.class);

    @Autowired
    FormSubmissionRepository formSubmissionRepository;

    /**
     * In this class's constructor, I pass the repository as an arg to make sure a repository is
     * always initialised when this class is instantiated.
     *
     * As I am using the Spring framework, the @Service annotation will automatically create this class
     * as a bean on start-up, also automatically injecting the formSubmissionRepository dependency for me.
     * This is an example of 'dependency injection'.
     *
     * This makes testing my code using junit easier, because I do not need to use the entire Spring context to
     * write tests.
     * @param formSubmissionRepository
     */
    public FormSubmissionService(FormSubmissionRepository formSubmissionRepository) {
        this.formSubmissionRepository = formSubmissionRepository;
    }

    /**
     * This method checks the formSubmission for its form type, calling the appropriate form type method through
     * a switch statement.
     * @param formSubmission
     */
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
        formSubmissionRepository.save(formSubmission);
    }

    private void accidentFormProcess(FormSubmission formSubmission) {
        logger.info("Processing form type: {} ", formSubmission.getType());
        formSubmissionRepository.save(formSubmission);
    }

}
