package edu.miu.cs545.alumnimanagementportal.dto;

import edu.miu.cs545.alumnimanagementportal.entiteis.Address;
import edu.miu.cs545.alumnimanagementportal.entiteis.User;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class UserProfileDto {
    private Long id;
    private Long userId;
    private Address address;
    private int phone;
    private String picture;
    private String gradeLevel;
    private String professionalachievement;
    private String bio;
}
