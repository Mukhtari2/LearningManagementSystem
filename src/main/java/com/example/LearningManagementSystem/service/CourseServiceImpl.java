package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.Enum.Role;
import com.example.LearningManagementSystem.Exception.ResourceNotFoundException;
import com.example.LearningManagementSystem.dto.CourseRequestDTO;
import com.example.LearningManagementSystem.dto.CourseResponseDTO;
import com.example.LearningManagementSystem.mapper.CourseMapper;
import com.example.LearningManagementSystem.model.Course;
import com.example.LearningManagementSystem.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;
    private final CourseService courseService;

    @PreAuthorize("hasRole('TEACHER')")
    @Override
    public CourseResponseDTO registerCourse(CourseRequestDTO requestDTO) {
        Course course = Course.builder()
                .status(requestDTO.getStatus())
                .description(requestDTO.getDescription())
                .title(requestDTO.getTitle())
                .teacherId(requestDTO.getTeacherId())
                .role(Role.TEACHER)
                .build();
        Course newCourse = courseRepository.insert(course);
        return courseMapper.toDto(newCourse);
    }

    @Override
    public Course findByCourseId(String courseId) {
        return courseRepository.findById(courseId).orElseThrow();
    }

    @PreAuthorize("hasRole('TEACHER')")
    @Override
    public CourseResponseDTO updateCourse(String courseId, CourseRequestDTO requestDTO) {
        // 1. Find the existing course
        Course existingCourse = courseService.findByCourseId(courseId);

        // 2. Check if the course exists
        if (existingCourse != null) {
            // 3. Map new data from the DTO to the existing entity
            courseMapper.updateEntityFromDto(requestDTO, existingCourse);

            // 4. Save the updated entity
            Course updatedCourse = courseRepository.save(existingCourse);

            // 5. Return the mapped DTO
            return courseMapper.toDto(updatedCourse);
        } else {
            // 6. Handle the missing resource
            throw new ResourceNotFoundException("Course not found with ID: " + courseId);
        }
    }



    @Override
    public Optional<Course> findOptionalByCourseId(String courseId) {
        return courseRepository.findById(courseId);
    }
}
