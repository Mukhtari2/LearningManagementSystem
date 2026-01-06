package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.dto.AssignmentRequestDTO;
import com.example.LearningManagementSystem.dto.AssignmentResponseDTO;
import com.example.LearningManagementSystem.model.Assignment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AssignmentMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "courseId", source = "course")
    @Mapping(target = "title", source = "request.getTitle")
    @Mapping(target = "description")

    Assignment toEntity(AssignmentRequestDTO requestDTO);
}
