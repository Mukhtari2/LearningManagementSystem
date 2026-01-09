package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.dto.AssignmentRequestDTO;
import com.example.LearningManagementSystem.dto.AssignmentResponseDTO;
import com.example.LearningManagementSystem.model.Assignment;


public interface AssignmentService {
    AssignmentResponseDTO viewAssignment(Long assignmentId);
    AssignmentResponseDTO createAssignment(AssignmentRequestDTO requestDTO);
    Assignment findByAssignmentId(Long assignmentId);

}
