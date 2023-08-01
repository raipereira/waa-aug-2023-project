package edu.miu.cs545.alumnimanagementportal.service;

import edu.miu.cs545.alumnimanagementportal.dto.UserDto;
import edu.miu.cs545.alumnimanagementportal.entiteis.User;
import edu.miu.cs545.alumnimanagementportal.repository.UserRepository;
import edu.miu.cs545.alumnimanagementportal.util.ListMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repo;
    private final ModelMapper mapper;

    public List<UserDto> getAll() {
        var entities = repo.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
       entities.forEach(entity ->{
            UserDto dto = mapper.map(entity, UserDto.class);
        //   System.out.println("userDto " + dto.getRoleDtoList());
            userDtoList.add(dto);
        });

        return  userDtoList;
    }

    public UserDto findById(Long id) {
        var entity = repo.findById(id);
        if(entity.isPresent()){
            return mapper.map(entity.get(), UserDto.class);
        }
        return null;
    }

    public void register(UserDto dto) {
        var entity = mapper.map(dto, User.class);
        repo.save(entity);
    }

    public boolean login(UserDto dto) {
       // var entity = repo.findByEmail(dto.getEmail());
        return repo.findByEmail(dto.getEmail()).isPresent();
        }
}
