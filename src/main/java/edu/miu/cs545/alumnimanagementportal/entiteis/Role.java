package edu.miu.cs545.alumnimanagementportal.entiteis;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
public class Role {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;


}
