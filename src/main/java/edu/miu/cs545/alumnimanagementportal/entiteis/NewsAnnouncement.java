package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "newsannouncement")
public class NewsAnnouncement {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String news;
    @Column(name = "publishdate")
    private Date publishDate;
    private String announcement;
    @Column(name = "ispublish")
    private boolean isPublish;
}
