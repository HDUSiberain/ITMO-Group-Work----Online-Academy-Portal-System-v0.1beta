package com.oap.test1.controller;

import com.oap.test1.model.outputModel.CourseClassInfo;
import com.oap.test1.service.Student_choose_classService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "classchoose")
public class Student_choose_classController {

    @Autowired
    private Student_choose_classService student_choose_classService;

    @GetMapping(value = "choose")
    public void studentChooseClass(@Param("studentId") String studentId, @Param("courseClassId") String courseClassId) {
    //public List<CourseClassInfo> studentChooseClass(@Param("studentId") String studentId, @Param("courseClassId") String courseClassId) {
        this.student_choose_classService.studentChooseClass(studentId, courseClassId);
    }

    @GetMapping(value = "withdrawal")
    public void studentWithdrawalClass(@Param("studentId") String studentId, @Param("courseClassId") String courseClassId) {
        this.student_choose_classService.studentWithdrawalClass(studentId, courseClassId);
    }
}

