package com.example.LearningManagementSystem.dto;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class SubmissionResponseDTO {

    private String id;

    private String assignmentId;

    private String studentId;

    private String fileUrl;

    private String answeredAt;

    private Integer grade;

    private String feedback;

    private Date submittedAt;

}
