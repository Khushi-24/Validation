package com.example.Validation;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @PostMapping("/createUser")
    public UserDto createUser(@Valid @RequestBody UserDto user) {
        User user1 = modelMapper.map(user, User.class);
        userRepository.save(user1);
        return user;
    }
}
