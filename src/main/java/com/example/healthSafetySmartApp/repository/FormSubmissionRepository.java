package com.example.healthSafetySmartApp.repository;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormSubmissionRepository extends JpaRepository<FormSubmission, Integer> {

}