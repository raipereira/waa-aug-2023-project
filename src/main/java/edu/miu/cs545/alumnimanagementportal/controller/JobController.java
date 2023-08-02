package edu.miu.cs545.alumnimanagementportal.controller;

import edu.miu.cs545.alumnimanagementportal.dto.JobOpportunityDto;
import edu.miu.cs545.alumnimanagementportal.service.JobOpportunityService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobs")
@RequiredArgsConstructor
public class JobController {

    private final JobOpportunityService service;

    @GetMapping()
    public List<JobOpportunityDto> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public JobOpportunityDto getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody JobOpportunityDto dto, HttpServletRequest request){
        service.create(dto);
        //StringBuffer requestURL = request.getRequestURL();
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
