package com.example.healthSafetySmartApp.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * This is a custom class representing the form data
 *
 * This class uses Hibernate, which is the persistence provider to the specification defined by Spring data JPA
 * in FormSubmissionRepository'. This means Spring will automatically create a database table automatically
 * based on this class structure.
 *
 * This is done through annotations such as:
 * @Entity Specifies that this class should be mapped to a database table
 * @Id Marks the primary key for the table
 * @GeneratedValue Specifies how to the primary key 'id'
 *
 */
@Entity
@Data
public class FormSubmission {

    /**
     * Variables or fields of the class
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String firstName;
    private String lastName;
    private Double phone;
    private String department;
    private String campus;
    // This defines the date pattern
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String description;
    private String infectionTracking;

    /**
     * No argument constructor only, as an all argument constructor is not needed.
     */
    public FormSubmission() {}

    /**
     * Setters and getters for the private fields of this class
     * @return
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfectionTracking() {
        return infectionTracking;
    }

    public void setInfectionTracking(String infectionTracking) {
        this.infectionTracking = infectionTracking;
    }

    /**
     * toString method inherited from the class Object
     * @return
     */
    @Override
    public String toString() {
        return "FormSubmission{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", department='" + department + '\'' +
                ", campus='" + campus + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", infectionTracking='" + infectionTracking + '\'' +
                '}';
    }
}