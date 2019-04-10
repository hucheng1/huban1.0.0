package com.huaban.dao;

import com.huaban.entity.Users;

public interface IUsersDao {

    Users selectByUid(Integer uid);
}
