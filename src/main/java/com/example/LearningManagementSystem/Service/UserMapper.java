package com.example.LearningManagementSystem.Service;

import com.example.LearningManagementSystem.Dto.UserRequestDTO;
import com.example.LearningManagementSystem.Dto.UserResponseDTO;
import com.example.LearningManagementSystem.Model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDTO toDto(User user);
}
