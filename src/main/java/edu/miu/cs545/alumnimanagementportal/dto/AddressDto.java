package edu.miu.cs545.alumnimanagementportal.dto;

import lombok.Data;

@Data
public class AddressDto {
    private String stress;
    private String city;
    private String state;
    private Integer zipcode;
}
