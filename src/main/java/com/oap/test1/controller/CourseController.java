package com.oap.test1.controller;

import com.oap.test1.service.CourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(value = "beingselectname")
    public List<String> showStudentSelectCourseName(@Param("id") String id) {
        return this.courseService.showStudentChooseCourseName(id);
    }
}
