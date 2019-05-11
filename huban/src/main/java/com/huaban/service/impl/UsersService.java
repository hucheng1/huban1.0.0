package com.huaban.service.impl;

import com.huaban.dao.*;
import com.huaban.entity.*;
import com.huaban.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan("com.huaban.dao")
@Service("usersService")
public class UsersService implements IUsersService{

    private IUsersDao dao;

    public IUsersDao getDao() {
        return dao;
    }

    @Override
    public int updateUser(Users u) {
        return dao.updateUser(u);
    }

    @Autowired
    public void setDao(IUsersDao dao) {
        this.dao = dao;
    }

    @Override
    public Users selectByUid(Integer uid) {
        return dao.selectByUid(uid);
    }

    @Override
    public Users selectlogin(Users users) {
        return dao.selectlogin(users);
    }

    @Override
    public int insertUser(Users users) {
        return dao.insertUser(users);
    }

    @Override
    public int selectReaquest(String email) {
        return dao.selectReaquest(email);
    }
}
