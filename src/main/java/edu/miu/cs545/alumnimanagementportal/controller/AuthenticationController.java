package edu.miu.cs545.alumnimanagementportal.controller;

import edu.miu.cs545.alumnimanagementportal.auth.AuthenticationResponse;
import edu.miu.cs545.alumnimanagementportal.auth.LoginRequest;
import edu.miu.cs545.alumnimanagementportal.auth.RegisterRequest;
import edu.miu.cs545.alumnimanagementportal.service.AuthenticationService;
import edu.miu.cs545.alumnimanagementportal.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;



    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest){
        return ResponseEntity.ok(service.register(registerRequest));
    }

     @PostMapping("/authenticate")
     public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest loginRequest){
         return ResponseEntity.ok(service.authenticate(loginRequest));
    }


//    @PostMapping("/refresh-token")
//    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        service.refreshToken(request, response);
//    }


}
