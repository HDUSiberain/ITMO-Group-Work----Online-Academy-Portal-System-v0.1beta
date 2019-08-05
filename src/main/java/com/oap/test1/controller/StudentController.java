package com.oap.test1.controller;

import com.oap.test1.model.outputModel.StudentInfo;
import com.oap.test1.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "info")
    public StudentInfo showStudentInfo(@Param("id") String id) {
        return this.studentService.showStudentInfoById(id);
    }

    @PostMapping(value = "pwdchange")
    public StudentInfo studentPasswordChange(@Param("id") String id, @Param("oldPassword") String oldPassword, @Param("newPassword") String newPassword) {
        return this.studentService.studentPasswordChange(id, oldPassword, newPassword);
    }

    @PostMapping(value = "mailchange")
    public StudentInfo studentMailBoxchange(@Param("id") String id, @Param("newMailBox") String newMailBox) {
        return this.studentService.studentEmailBoxChange(id,newMailBox);
    }
}
