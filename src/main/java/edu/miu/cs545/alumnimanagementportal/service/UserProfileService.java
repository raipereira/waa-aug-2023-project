package edu.miu.cs545.alumnimanagementportal.service;

import edu.miu.cs545.alumnimanagementportal.dto.UserProfileDto;
import edu.miu.cs545.alumnimanagementportal.entiteis.UserProfile;
import edu.miu.cs545.alumnimanagementportal.repository.UserProfileRepository;
import edu.miu.cs545.alumnimanagementportal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileRepository repo;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public void create(UserProfileDto dto) {
        System.out.println(" ===> " + dto);
        var user = userRepository.findById(dto.getUserId());
        var entity = modelMapper.map(dto, UserProfile.class);
        entity.setUser(user.get());
        repo.save(entity);
    }
}
