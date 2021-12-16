package com.interview.exercise.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

    private String name;
    private String surname;
    private UserDto user;

}
