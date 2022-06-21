package com.example.healthSafetySmartApp.repository;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import org.springframework.stereotype.Repository;

public interface FormSubmissionRepositoryCustom {

    void saveFormToDatabase(FormSubmission formSubmission);

}
