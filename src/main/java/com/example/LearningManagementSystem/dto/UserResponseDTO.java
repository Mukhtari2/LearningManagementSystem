package com.example.LearningManagementSystem.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
}
