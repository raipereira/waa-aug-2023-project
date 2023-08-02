package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "attendance_event")
public class Attendance {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private Date dob;
    @Enumerated(EnumType.STRING)
    @Column(name = "attendance_confirmation")
    private RSVP rsvps;


}
