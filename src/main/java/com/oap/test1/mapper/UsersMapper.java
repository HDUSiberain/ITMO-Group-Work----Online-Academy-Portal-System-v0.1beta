package com.oap.test1.mapper;

import com.oap.test1.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UsersMapper {

    @Select("SELECT * FROM Users WHERE UID = #{id} and Upw = #{password} and Uidentity = #{identity}")
    Users userLogin(@Param("id") String id, @Param("password") String password, @Param("identity") String identity);

    @Select("SELECT * FROM Users WHERE UID = #{id}")
    Users userImformationGetById(@Param("id") String id);

    @Select("SELECT * FROM Users WHERE UID = #{id} and Upw = #{password}")
    Users userPasswordCheck(@Param("id") String id, @Param("password") String password);

    @Update("UPDATE Users SET Upw = #{newPassword} WHERE UID = #{id}")
    void passwordChange(@Param("newPassword") String newPassword, @Param("id") String id);

    @Update("UPDATE Users SET Uemail = #{mailbox} WHERE UID = #{id}")
    void emailChange(@Param("mailbox") String mailbox, @Param("id") String id);


}
