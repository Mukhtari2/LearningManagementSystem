package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Testcontainers
@ActiveProfiles("test")
class UserServiceImplTest {

    @Container
    static MongoDBContainer mongoDBContainer =
            new MongoDBContainer("mongo:6.0.13")
                    .withStartupTimeout(Duration.ofSeconds(120));

    @DynamicPropertySource
    static void setProperties(DynamicPropertyRegistry registry) {
//        if (!mongoDBContainer.isRunning()) {
//            mongoDBContainer.start();
//        }
        registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


//    @BeforeEach
//    void setUp() {
//        userRepository.deleteAll();
//    }

    @Test
    void toRegisterNewUser() {

    }
}