package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.dto.LessonRequestDTO;
import com.example.LearningManagementSystem.dto.LessonResponseDTO;
import com.example.LearningManagementSystem.model.Lesson;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LessonMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "courseId", source = "course")
    @Mapping(target = "title", source = "request.getTitle")
    @Mapping(target = "contentUrl", source = "request.getContentUrl")
    Lesson toEntity(LessonRequestDTO lessonRequestDTO);
    LessonResponseDTO toDto(Lesson lesson);
}
