package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.Exception.ResourceNotFoundException;
import com.example.LearningManagementSystem.dto.AssignmentRequestDTO;
import com.example.LearningManagementSystem.dto.AssignmentResponseDTO;
import com.example.LearningManagementSystem.mapper.AssignmentMapper;
import com.example.LearningManagementSystem.model.Assignment;
import com.example.LearningManagementSystem.model.Course;
import com.example.LearningManagementSystem.repository.AssignmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssignmentServiceImpl implements AssignmentService {

    private final CourseService courseService;
    private final AssignmentRepository assignmentRepository;
    private final AssignmentMapper assignmentMapper;

    @Override
    public AssignmentResponseDTO viewAssignment(Long assignmentId) {
        Assignment assignment = assignmentRepository.findById(assignmentId)
                .orElseThrow(() -> new ResourceNotFoundException
                        ("Assignment with ID " + assignmentId + " not found "));

        return assignmentMapper.toDto(assignment);
    }

    @PreAuthorize("hasRole('TEACHER')")
    @Override
    public AssignmentResponseDTO createAssignment(AssignmentRequestDTO requestDTO) {
        Course course = courseService.findByCourseId(requestDTO.getCourseId());
        if (course != null) {
            Assignment viewAssignment = assignmentMapper.toEntity(requestDTO, course);
            Assignment saveAssignment = assignmentRepository.insert(viewAssignment);
            return assignmentMapper.toDto(saveAssignment);
        } else throw new ResourceNotFoundException
                ("No course id found to view assignment");
    }

    @Override
    public Assignment findByAssignmentId(Long assignmentId) {
        return assignmentRepository.findById(assignmentId).orElseThrow();
    }

}
