package com.example.healthSafetySmartApp.repository;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FormSubmissionRepositoryImpl implements FormSubmissionRepositoryCustom {

    @Autowired
    FormSubmissionRepository formSubmissionRepository;

    @Override
    public void saveFormToDatabase(FormSubmission formSubmission) {
        formSubmissionRepository.save(formSubmission);
    }
}
