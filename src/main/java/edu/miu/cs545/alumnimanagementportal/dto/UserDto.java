package edu.miu.cs545.alumnimanagementportal.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
