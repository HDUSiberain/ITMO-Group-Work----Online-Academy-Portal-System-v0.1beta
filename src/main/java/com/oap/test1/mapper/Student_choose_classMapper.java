package com.oap.test1.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Student_choose_classMapper {
    @Insert("INSERT INTO Student_choose_class(SID, CCID) VALUES(#{sId}, #{cCId})")
    void studentChooseClass(@Param("sId") String sId, @Param("cCId") String cCId);

    @Delete("DELETE FROM Student_choose_class WHERE SID = #{sId} AND CCID = #{cCId}")
    void studentWithdrawalClass(@Param("sId") String sId, @Param("cCId") String cCId);

    @Update("UPDATE Course_class SET CCnum = CCnum + 1 WHERE CCID = #{id}")
    void course_classPersonNumPlus(@Param("id") String id);

    @Update("UPDATE Course_class SET CCnum = CCnum - 1 WHERE CCID = #{id}")
    void course_classPersonNumSub(@Param("id") String id);
}
