package com.example.LearningManagementSystem.Dto;

import com.example.LearningManagementSystem.Model.Course;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LessonResponseDTO {
    private Long id;
    private Course courseId;
    private String tittle;
    private String contentUrl;
}
