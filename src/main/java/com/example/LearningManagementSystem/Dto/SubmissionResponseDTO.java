package com.example.LearningManagementSystem.Dto;

import com.example.LearningManagementSystem.Model.Assignment;
import com.example.LearningManagementSystem.Model.Student;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SubmissionResponseDTO {
    private Long id;
    private Assignment assignmentId;
    private Student studentId;
    private String fileUrl;
    private String answeredAt;
    private Integer grade;
    private String feedback;
}
