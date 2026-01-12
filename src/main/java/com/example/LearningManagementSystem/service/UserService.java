package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.authenticationAndAuthorization.AuthenticationRequest;
import com.example.LearningManagementSystem.authenticationAndAuthorization.AuthenticationResponse;

public interface UserService {
    AuthenticationResponse register(AuthenticationRequest request);

}
