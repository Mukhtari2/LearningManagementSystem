package com.example.LearningManagementSystem.mapper;

import com.example.LearningManagementSystem.dto.CourseRequestDTO;
import com.example.LearningManagementSystem.dto.CourseResponseDTO;
import com.example.LearningManagementSystem.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

import java.util.Optional;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
    public interface CourseMapper {

        // Main entry point for your service
        default void toEntity(CourseRequestDTO requestDTO, Optional<Course> existingCourse) {
            existingCourse.ifPresent(course -> updateEntityFromDto(requestDTO, course));
        }

        // The actual mapping logic that updates the entity
        @Mapping(target = "id", ignore = true) // Usually, IDs are not updated via DTOs
        void updateEntityFromDto(CourseRequestDTO requestDTO, @MappingTarget Course course);

        // standard DTO conversion
        CourseResponseDTO toDto(Course course);
    }

