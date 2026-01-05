package com.example.LearningManagementSystem.Dto;

import com.example.LearningManagementSystem.Model.Course;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class AssignmentResponseDTO {
    private Long id;
    private Course courseId;
    private String tittle;
    private String description;
    private Date dueDate;
}
