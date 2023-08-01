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
    //private final ListMapper mapperr;

    public List<UserDto> getAll() {
        var entities = repo.findAll();
        //return mapperr.mapList(entities, UserDto.class);
        List<UserDto> userDtoList = new ArrayList<>();
       entities.forEach(entity ->{
            UserDto dto = mapper.map(entity, UserDto.class);
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
