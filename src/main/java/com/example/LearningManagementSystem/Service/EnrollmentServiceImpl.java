package com.example.LearningManagementSystem.Service;

import com.example.LearningManagementSystem.Model.Enrollment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService{
    @Override
    public Enrollment enrollPublishedCourse() {
        return null;
    }

    @Override
    public List<Enrollment> viewAllEnrolledCourses() {
        return List.of();
    }
}
