package com.interview.exercise.mapper;

import com.interview.exercise.entities.Role;
import com.interview.exercise.model.RoleDto;

public interface RoleMapper {

     Role roleDtoToRole(RoleDto roleDto);
     default String nameToUpper (RoleDto roleDto) {
        return roleDto.getName().toUpperCase();
    }
}
