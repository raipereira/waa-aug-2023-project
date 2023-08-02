package edu.miu.cs545.alumnimanagementportal.service;

import edu.miu.cs545.alumnimanagementportal.dto.AddressDto;
import edu.miu.cs545.alumnimanagementportal.dto.UserProfileDto;
import edu.miu.cs545.alumnimanagementportal.entiteis.Address;
import edu.miu.cs545.alumnimanagementportal.entiteis.UserProfile;
import edu.miu.cs545.alumnimanagementportal.exception.ResourceNotFoundException;
import edu.miu.cs545.alumnimanagementportal.exception.UserNotFoundException;
import edu.miu.cs545.alumnimanagementportal.repository.UserProfileRepository;
import edu.miu.cs545.alumnimanagementportal.repository.UserRepository;
import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UserProfileService {

    private final UserProfileRepository repo;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public void create(UserProfileDto dto) {
        var user = userRepository.findById(dto.getUserId());
        var entity = modelMapper.map(dto, UserProfile.class);
        entity.setUser(user.get());
//        entity.getAddress().setCity(dto.getAddress().getCity());
//        entity.getAddress().setZipcode(dto.getAddress().getZipcode());
//        entity.getAddress().setState(dto.getAddress().getState());
//        entity.getAddress().setStress(dto.getAddress().getStress());
        repo.save(entity);
    }

    public UserProfileDto profileByUserId(Long userId) {
        var entity = repo.findByUserId(userId);
        if(!entity.isPresent()){
            throw new ResourceNotFoundException("User profile not found");
        }
            return modelMapper.map(entity.get(), UserProfileDto.class);

    }

    public void EditProfileByUserId(UserProfileDto dto, Long userId) {
        var userProfileOptional = repo.findByUserId(userId);
        if(!userProfileOptional.isPresent()) throw new ResourceNotFoundException("User not found");
        UserProfile profileEntity = userProfileOptional.get();
        var profile = fillProfile(dto, profileEntity);
         repo.save(profile);
    }

    private void fillProfile(UserProfile profileEntity) {

    }

    private UserProfile fillProfile(UserProfileDto dto, UserProfile profile) {
    //  var addressDto = dto.getAddress();
   //   var addressEntity = profile.getAddress();
//        if(addressDto.getCity() != null) addressEntity.setCity(addressDto.getCity());
//        if(addressDto.getState() != null)addressEntity.setState(addressDto.getState());
//        if(addressDto.getStress() != null) addressEntity.setStress(addressDto.getStress());
//        if(addressDto.getZipcode() != null) addressEntity.setZipcode(addressDto.getZipcode());
        if(dto.getBio() != null) profile.setBio(dto.getBio());
       // if(dto.getPhone() != null) profile.setPhone(dto.getPhone());
      //  if(dto.getGradeLevel() != null) profile.setGradeLevel(dto.getGradeLevel());
        if(dto.getProfessionalachievement() != null) profile.setProfessionalachievement(dto.getProfessionalachievement());
        if(dto.getPicture() != null) profile.setPicture(dto.getPicture());
      //  profile.setAddress(addressEntity);

        return profile;

    }

//    public void search(Integer graduationYear, String course, String location, String industry) {
//      //  repo.search(graduationYear,course,location,industry);
//    }





}
