package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Survey {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String description;
    private String creator;
    private String startDate;
    private String endDate;
    @OneToMany
    @JoinColumn(name = "survey_question")
    private List<Question> questions;
   // private List<Option> options;
   @OneToMany
   @JoinColumn(name = "SurveyParticipant")
    private List<SurveyParticipant> participants;
    private boolean isPublic;
    private boolean isAnonymous;
    private boolean isRequired;
}
