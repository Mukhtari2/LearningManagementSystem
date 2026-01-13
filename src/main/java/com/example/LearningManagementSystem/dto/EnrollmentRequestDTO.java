package com.example.LearningManagementSystem.dto;


import lombok.*;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class EnrollmentRequestDTO {

    private String studentId;

    private String courseId;

}

