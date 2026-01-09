package com.example.LearningManagementSystem.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Lesson {
    @Id
    private Long id;
    private Course course;
    private String title;
    private String contentUrl;
}
