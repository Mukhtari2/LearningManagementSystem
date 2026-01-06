package com.example.LearningManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonRequestDTO {
    private Long id;
    private Long courseId;
    private String title;
    private String contentUrl;
}
