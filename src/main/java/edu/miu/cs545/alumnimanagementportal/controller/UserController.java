package edu.miu.cs545.alumnimanagementportal.controller;

import edu.miu.cs545.alumnimanagementportal.dto.UserDto;
import edu.miu.cs545.alumnimanagementportal.exception.UserNotFoundException;
import edu.miu.cs545.alumnimanagementportal.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDto> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDto getOneById(@PathVariable Long id){
        var userDto = userService.findById(id);
        if(userDto == null){
            throw  new UserNotFoundException("User id " + id + "Not Found");
        }else{
            return userDto;
        }
    }

//    @PostMapping("/register")
//    public void register(@RequestBody UserDto dto){
//        userService.register(dto);
//    }
//
//     @PostMapping("/login")
//     public boolean login(@RequestBody UserDto dto){
//           return userService.login(dto);
//    }


}
