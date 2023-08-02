package edu.miu.cs545.alumnimanagementportal.controller;

import edu.miu.cs545.alumnimanagementportal.service.StudentService;
import edu.miu.cs545.alumnimanagementportal.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/directory/search")
@RequiredArgsConstructor
public class DirectoryController {

private final StudentService service;

    @GetMapping()
    public String search(
            @RequestParam(required = false, defaultValue = "0") Integer graduationYear,
            @RequestParam(required = false) String course,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) String industry)
    {
        service.search(graduationYear,course,location,industry);
        return "search called";
    }
}
