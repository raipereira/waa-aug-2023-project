package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {

    private String stress;
    private String city;
    private String state;
    private Integer zipcode;

}
