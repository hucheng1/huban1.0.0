package com.huaban.service.impl;

import com.huaban.dao.IClassDao;
import com.huaban.entity.Class;
import com.huaban.service.IClassService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@MapperScan("com.huaban.dao")
@Service("classService")
public class ClassService implements IClassService{

    private IClassDao dao;

    public IClassDao getDao() {
        return dao;
    }

    @Autowired
    public void setDao(IClassDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Class> selectAll() {
        return dao.selectAll();
    }
}
