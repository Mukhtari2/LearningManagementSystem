package com.example.LearningManagementSystem.dto;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class AssignmentRequestDTO {
    private Long id;
    private Long courseId;
    private String tittle;
    private String description;
    private Date dueDate;
}
