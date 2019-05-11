package com.huaban.dao;

import com.huaban.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUsersDao {

    Users selectByUid(@Param("uid")Integer uid);

    List<Users> selectAll();

    Users selectlogin(Users u);

    int insertUser(Users users);

    int selectReaquest(String email);

    int updateUser(Users u);
}
