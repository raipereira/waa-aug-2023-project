package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "jobopportunity")
public class JobOpportunity {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String company;
    private int placement;
    private double salary;
    private String employmentType; // Full-time, Part-time, Contract, etc.
    private String skillsRequired;
    private String contactEmail;
    private String contactPhone;
    private LocalDate postingDate;

}
