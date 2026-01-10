package com.example.LearningManagementSystem.mapper;

import com.example.LearningManagementSystem.dto.SubmissionRequestDTO;
import com.example.LearningManagementSystem.dto.SubmissionResponseDTO;
import com.example.LearningManagementSystem.model.Assignment;
import com.example.LearningManagementSystem.model.Submission;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, imports = {java.util.Date.class})
public interface SubmissionMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "assignment", source = "assignment")
    @Mapping(target = "studentId", source = "requestDTO.studentId")
    @Mapping(target = "answeredAt", source = "requestDTO.answeredAt")
    @Mapping(target = "fileUrl", source = "requestDTO.fileUrl")
    @Mapping(target = "submittedAt", expression = "java(new Date())")
    @Mapping(target = "grade", source = "requestDTO.grade")
    @Mapping(target = "feedback", source = "requestDTO.feedback")


    Submission toEntity(SubmissionRequestDTO requestDTO, Assignment assignment);
    @Mapping(target = "assignmentId", source = "assignment.id")
    SubmissionResponseDTO toDto(Submission submission);
}
