package com.example.LearningManagementSystem.Repository;

import com.example.LearningManagementSystem.Model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
