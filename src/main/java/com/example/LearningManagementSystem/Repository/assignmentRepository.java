package com.example.LearningManagementSystem.Repository;

import com.example.LearningManagementSystem.Model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface assignmentRepository extends JpaRepository<Assignment, Long> {
}
