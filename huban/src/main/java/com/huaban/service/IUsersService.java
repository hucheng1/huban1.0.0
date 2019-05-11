package com.huaban.service;

import com.huaban.entity.Users;

public interface IUsersService {

    Users selectByUid(Integer uid);

    Users selectlogin(Users users);

    int insertUser(Users users);

    int selectReaquest(String email);

    int updateUser(Users u);
}
