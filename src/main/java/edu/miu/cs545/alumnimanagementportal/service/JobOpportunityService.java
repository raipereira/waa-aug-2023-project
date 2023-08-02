package edu.miu.cs545.alumnimanagementportal.service;

import edu.miu.cs545.alumnimanagementportal.dto.JobOpportunityDto;
import edu.miu.cs545.alumnimanagementportal.entiteis.JobOpportunity;
import edu.miu.cs545.alumnimanagementportal.exception.ResourceNotFoundException;
import edu.miu.cs545.alumnimanagementportal.repository.JobOpportunityRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobOpportunityService {

    private final JobOpportunityRepository repo;
    private final ModelMapper mapper;

    public List<JobOpportunityDto> getAll() {
        var entities = repo.findAll();
        List<JobOpportunityDto> dtos = new ArrayList<>();
        entities.forEach(entity ->{
            JobOpportunityDto dto = mapper.map(entity, JobOpportunityDto.class);
            dtos.add(dto);
        });
        return dtos;
    }

    public JobOpportunityDto getById(Long id) {
        var entity = repo.findById(id);
        if(!entity.isPresent()) throw new ResourceNotFoundException("Job not found");
        return mapper.map(entity, JobOpportunityDto.class);
    }

    public void create(JobOpportunityDto dto) {
        JobOpportunity entity = mapper.map(dto, JobOpportunity.class);
        repo.save(entity);
    }
}
