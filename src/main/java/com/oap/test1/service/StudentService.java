package com.oap.test1.service;

import com.oap.test1.mapper.StudentMapper;
import com.oap.test1.mapper.UsersMapper;
import com.oap.test1.model.Student;
import com.oap.test1.model.Users;
import com.oap.test1.model.outputModel.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private UsersMapper usersMapper;

    private UsersService usersService;

    public StudentInfo showStudentInfoById(String studentId) {
        Users user = new Users();
        Student student = new Student();
        StudentInfo studentInfo = new StudentInfo();
        user = this.usersMapper.userImformationGetById(studentId);
        student = this.studentMapper.studentInformationGetById(studentId);
        studentInfo.setStudentInfo(student.getSclass(), student.getSID(), user.getUname(), user.getUemail(), user.getUsex());
        return studentInfo;
    }

    public StudentInfo studentPasswordChange(String studentId, String studentOldPassword, String studentNewPassword ) {
        Users user = new Users();
        user = this.usersService.userPasswordChange(studentId, studentOldPassword, studentNewPassword);
        return this.showStudentInfoById(user.getUID());
    }

    public StudentInfo studentEmailBoxChange(String studentId, String mailBox) {
        Users user = new Users();
        user = this.usersService.userEmailBoxChange(studentId, mailBox);
        return this.showStudentInfoById(user.getUID());
    }






}
