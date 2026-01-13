package com.example.LearningManagementSystem.dto;

//import com.example.LearningManagementSystem.model.Course;
import com.example.LearningManagementSystem.model.Course;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class EnrollmentResponseDTO {

    private String id;

    private String studentId;

    private Course courseId;

    private Date enrolledAt;

}
