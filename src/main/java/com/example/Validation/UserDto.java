package com.example.Validation;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserDto {

    private Long id;

    @NotNull(message = "First Name can't be null")
    private String firstName;

    @NotNull(message = "Last Name can't be null")
    private String lastName;

    @NotNull(message = "Email can't be null")
    private String email;
}
