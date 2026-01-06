package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.dto.UserRequestDTO;
import com.example.LearningManagementSystem.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO register(UserRequestDTO request);

}
