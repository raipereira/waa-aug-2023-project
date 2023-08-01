package edu.miu.cs545.alumnimanagementportal.controller;

import edu.miu.cs545.alumnimanagementportal.dto.UserProfileDto;
import edu.miu.cs545.alumnimanagementportal.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profiles")
@RequiredArgsConstructor
public class UserProfileController {

    private final UserProfileService service;

    @PostMapping
    public ResponseEntity create(@RequestBody UserProfileDto dto){
        service.create(dto);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
