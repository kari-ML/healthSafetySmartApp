package com.example.healthSafetySmartApp.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormSubmission {
    private String type;
    private String firstName;
    private String lastName;
    private Double phone;
    private String department;
    private String campus;
    private LocalDate date;
    private String description;
    private String infectionTracking;
}