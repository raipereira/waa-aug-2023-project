package edu.miu.cs545.alumnimanagementportal.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class JobOpportunityDto {
    private Long id;
    private String title;
    private String description;
    private String company;
    private boolean placement;
    private double salary;
    private String employmentType; // Full-time, Part-time, Contract, etc.
    private String skillsRequired;
    private String contactEmail;
    private String contactPhone;
    private LocalDate postingDate;

}
