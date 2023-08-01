package edu.miu.cs545.alumnimanagementportal.auth;

import edu.miu.cs545.alumnimanagementportal.entiteis.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private List<Role> roles = new ArrayList<>();
}
