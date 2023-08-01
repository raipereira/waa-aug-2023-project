package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserProfile {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;
    @Embedded
    private Address address;
    private int phone;
    private String picture;
    private String gradeLevel;
    private String professionalachievement;
    private String bio;



}
