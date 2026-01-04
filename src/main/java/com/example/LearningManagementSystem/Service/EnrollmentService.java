package com.example.LearningManagementSystem.Service;

import com.example.LearningManagementSystem.Model.Enrollment;

import java.util.List;

public interface EnrollmentService {
    Enrollment enrollPublishedCourse();
    List<Enrollment> viewAllEnrolledCourses();
}
