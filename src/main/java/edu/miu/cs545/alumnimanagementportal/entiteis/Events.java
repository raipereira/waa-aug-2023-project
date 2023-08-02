package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EventType type;
    private String title;
    private String description;
    private LocalDate date;
    private String location;
    @Column(name = "attendances_number")
    private int numAttendece;
    @OneToMany
    @JoinColumn(name = "event_id")
    private List<Attendance> attendanceList;


}
