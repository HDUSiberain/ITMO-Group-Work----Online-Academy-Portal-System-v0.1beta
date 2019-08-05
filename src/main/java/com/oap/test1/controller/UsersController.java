package com.oap.test1.controller;

import com.oap.test1.model.Users;
import com.oap.test1.service.UsersService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping(value = "login")
    public Users userLoginCheck(@Param("id") String id, @Param("password") String password, @Param("identity") String identity) {
        return this.usersService.userLoginCheck(id, password, identity);
    }
    @PostMapping(value = "pwdchange")
    public Users userPasswordChange(@Param("id") String id, @Param("oldPassword") String oldPassword, @Param("newPassword") String newPassword) {
        return this.usersService.userPasswordChange(id, oldPassword, newPassword);
    }

    @PostMapping(value = "mailchange")
    public Users useMailBoxchange(@Param("id") String id, @Param("newMailBox") String newMailBox) {
        return this.usersService.userEmailBoxChange(id,newMailBox);
    }

}
