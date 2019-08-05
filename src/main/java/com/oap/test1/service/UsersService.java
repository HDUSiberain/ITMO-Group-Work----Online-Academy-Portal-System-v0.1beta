package com.oap.test1.service;

import com.oap.test1.mapper.UsersMapper;
import com.oap.test1.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public Users userLoginCheck(String userId, String userPassword, String userIdentity) {
        Users user = new Users();
        user = this.usersMapper.userLogin(userId, userPassword, userIdentity);
        if (user.getUID().equals(userId))
            return user;
        else
            return null;
    }

    public Users userPasswordChange(String userId, String userOldPassWord, String userNewPassWord) {
        Users user = new Users();
        user = this.usersMapper.userPasswordCheck(userId, userOldPassWord);
        if(user.getUID().equals(userId)){
            this.usersMapper.passwordChange(userNewPassWord, userId);
            return this.usersMapper.userImformationGetById(userId);
        }
        else
            return null;
    }

    public Users userEmailBoxChange(String userId, String mailBox) {
        this.usersMapper.emailChange(mailBox, userId);
        return this.usersMapper.userImformationGetById(userId);
    }

}
