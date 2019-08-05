package com.oap.test1.controller;

import com.oap.test1.model.outputModel.CourseClassInfo;
import com.oap.test1.model.outputModel.CourseClassSimpleInfo;
import com.oap.test1.service.Course_classService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "courseclass")
public class Course_classController {

    @Autowired
    private Course_classService course_classService;

    @GetMapping(value = "classsimpleinfo")
    public CourseClassSimpleInfo showStudentChooseClassSimpleInfo(@Param("id") String id, @Param("courseName") String courseName) {
        return this.course_classService.showStudentChooseClassSimpleInfo(id, courseName);
    }

    @GetMapping(value = "allchooseclassinfo")
    public List<CourseClassInfo> showStudentChooseClassInfo(@Param("id") String id) {
        return this.course_classService.showStudentChooseClassInfo(id);
    }

    @GetMapping(value = "allcanchooseclassinfo")
    public List<CourseClassInfo> showStudentCanChooseClassInfo(@Param("id") String id) {
        return this.course_classService.showStudentCanChooseClassInfo(id);
    }

}
