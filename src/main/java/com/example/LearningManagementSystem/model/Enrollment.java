package com.example.LearningManagementSystem.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Enrollment {
    private Long id;
    private Long studentId;
    private Course courseId;
    private Date enrolledAt;

}
