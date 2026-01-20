package com.example.LearningManagementSystem.service;

import com.example.LearningManagementSystem.repository.CourseRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {


    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    @Before
    public void setUp() throws Exception {
        mongoTemplate.getDb().drop();
    }

    @Test
    public void registerCourse() {

    }
}