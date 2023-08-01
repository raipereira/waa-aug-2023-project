package edu.miu.cs545.alumnimanagementportal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.miu.cs545.alumnimanagementportal.entiteis.Role;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private List<RoleDto> roles = new ArrayList<>();
}
