package com.example.LearningManagementSystem.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserRequestDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
}
