package com.interview.exercise.model;

import com.interview.exercise.model.RoleDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String name;
    private String surname;
    private RoleDto role;
}
