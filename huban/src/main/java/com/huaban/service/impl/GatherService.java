package com.huaban.service.impl;


import com.huaban.dao.IGatherDao;
import com.huaban.entity.Gather;
import com.huaban.service.IGatherService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan("com.huaban.dao")
@Service("gatherService")
public class GatherService implements IGatherService{

    @Autowired
    private IGatherDao gd;

    public IGatherDao getGd() {
        return gd;
    }

    public void setGd(IGatherDao gd) {
        this.gd = gd;
    }


    @Override
    public List<Gather> selectimgAll(Map map) {
        return gd.selectimgAll(map);
    }
}
