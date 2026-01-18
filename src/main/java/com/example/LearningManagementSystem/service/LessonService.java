package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.dto.LessonRequestDTO;
import com.example.LearningManagementSystem.dto.LessonResponseDTO;

public interface LessonService {
    LessonResponseDTO addLesson (LessonRequestDTO request);
    LessonResponseDTO viewLesson (String lessonId);

}
