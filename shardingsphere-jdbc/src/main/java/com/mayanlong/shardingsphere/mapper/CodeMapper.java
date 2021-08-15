package com.mayanlong.shardingsphere.mapper;

import com.mayanlong.shardingsphere.entity.Code;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CodeMapper {

    @Select("SELECT * FROM `pre_code` WHERE user_id=#{userId} ")
    List<Code> findAllByUserId(@Param("userId") int userId);

    @Insert(" INSERT INTO `pre_code` " +
            " (id, user_id, code, door_clock, created_at, updated_at) " +
            " VALUES" +
            " (#{id}, #{user_id}, #{code}, #{door_clock}, #{created_at}, #{updated_at})")
    int insert(Code code);

}
