package com.huaban.service.impl;

import com.huaban.dao.IGatherDao;
import com.huaban.entity.Gather;
import com.huaban.service.IGatherService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 采集服务类
 */
@Transactional
@Service("gatherService")
@MapperScan("com.huaban.dao")
public class GatherService implements IGatherService{

    private IGatherDao dao;

    public IGatherDao getDao() {
        return dao;
    }

    @Autowired
    public void setDao(IGatherDao dao) {
        this.dao = dao;
    }

    public Gather selectBygid(int gid) {
        return dao.selectBygid(gid);
    }

    public List<Gather> selectByHid(Integer hid) {
        return dao.selectByHid(hid);
    }
}
