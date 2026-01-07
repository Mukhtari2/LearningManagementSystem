package com.example.LearningManagementSystem.controller;

import com.example.LearningManagementSystem.dto.EnrollmentRequestDTO;
import com.example.LearningManagementSystem.dto.EnrollmentResponseDTO;
import com.example.LearningManagementSystem.service.EnrollmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/enrollments")
public class EnrollmentController {

    public final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @PostMapping("/enroll")
    public ResponseEntity<EnrollmentResponseDTO> enrolPublishedCourse(@RequestBody EnrollmentRequestDTO enrollmentRequestDTO){
        EnrollmentResponseDTO enroll = enrollmentService.enrollPublishedCourse(enrollmentRequestDTO);
        return new ResponseEntity<>(enroll, HttpStatus.CREATED);
    }
}
