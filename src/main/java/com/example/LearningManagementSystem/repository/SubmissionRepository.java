package com.example.LearningManagementSystem.repository;

import com.example.LearningManagementSystem.model.Submission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubmissionRepository extends MongoRepository<Submission, String> {

    Optional<Submission> findById (String id);
}
