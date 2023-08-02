package edu.miu.cs545.alumnimanagementportal.dto;

import edu.miu.cs545.alumnimanagementportal.entiteis.Address;
import edu.miu.cs545.alumnimanagementportal.entiteis.Course;
import edu.miu.cs545.alumnimanagementportal.entiteis.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private Long id;
    private UserDto user;
    private String graduationlevel;
    private Integer graduationyear;
    private String industry;
    //private List<Course> courseTaken;
    private AddressDto address;
    private Integer phone;
}
