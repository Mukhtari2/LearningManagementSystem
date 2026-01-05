package com.example.LearningManagementSystem.Dto;

import com.example.LearningManagementSystem.Model.Course;
import com.example.LearningManagementSystem.Model.Student;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class EnrollmentResponseDTO {
    private Long id;
    private Student studentId;
    private Course courseId;
    private Date enrolledAt;
}
