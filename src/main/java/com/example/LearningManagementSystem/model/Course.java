package com.example.LearningManagementSystem.model;

import com.example.LearningManagementSystem.Enum.Status;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    private String description;
    private Long teacherId;

    @Enumerated(EnumType.STRING)
    private Status status;
}
