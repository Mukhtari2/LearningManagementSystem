package com.example.LearningManagementSystem.controller;

import com.example.LearningManagementSystem.dto.LessonRequestDTO;
import com.example.LearningManagementSystem.dto.LessonResponseDTO;
import com.example.LearningManagementSystem.service.LessonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/lessons")
public class LessonController {

    public final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PostMapping("/addLesson")
    public ResponseEntity<LessonResponseDTO> addLesson (LessonRequestDTO lessonRequestDTO){
        LessonResponseDTO newLesson = lessonService.addLesson(lessonRequestDTO);
        return new ResponseEntity<>(newLesson, HttpStatus.CREATED);
    }
}

