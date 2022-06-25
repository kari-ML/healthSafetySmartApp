package com.example.healthSafetySmartApp.repository;

import com.example.healthSafetySmartApp.entity.FormSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This is the 'persistence layer' of my application.
 *
 * @Repository annotation is used to mark this interface as a repository to catch any persistence-specific exceptions,
 * and to re-throw them as one of Spring's unified unchecked exceptions. This annotation also includes @Component,
 * instructing Spring to register this interface as a @Bean and store it inside the ApplicationContext.
 *
 * This part of my application uses Spring Data JPA, which allows me to define how my database should be interacted
 * with, without providing the how (like all interfaces).
 *
 * This interface extends JpaRepository, an interface that enables me to perform CRUD actions
 * to my embedded H2 database.
 *
 * JPARepository requires two types to be declared
 * 1) The object type to be stored in the database (FormSubmission)
 * 2) The primary key of the object type (**Integer)
 *
 * **This cannot be a primitive type, which is why I'm using the Wrapper class Integer instead
 */
@Repository
public interface FormSubmissionRepository extends JpaRepository<FormSubmission, Integer> {
}