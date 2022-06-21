package com.example.healthSafetySmartApp.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class FormSubmission {
    private String type;
    private String firstName;
    private String lastName;
    private Double phone;
    private String department;
    private String campus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String description;
    private String infectionTracking;

    public FormSubmission() {}

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
}