package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Faculty {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne()
    @JoinColumn(name = "user_id", unique = true)
    private User user;
    @Embedded
    private Address address;
    private Integer phone;
}
