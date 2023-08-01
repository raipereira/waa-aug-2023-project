package edu.miu.cs545.alumnimanagementportal.entiteis;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String stress;
    private String city;
    private String state;
    private int zipcode;

}
