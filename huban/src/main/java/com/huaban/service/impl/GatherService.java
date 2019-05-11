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


    //查询首页为你推荐
    @Override
    public List<Gather> selectTuiJian() {
        return dao.selectTuiJian();
    }

    //查询画板关注所有信息图片
    @Override
    public List<Gather> selectHubanAll(int hid) {
        return dao.selectHubanAll(hid);
    }

    //查询画板
    @Override
    public List<Gather> selectById(Integer hid) {
        return dao.selectById(hid);
    }


    //查询为你推荐的图片
    public List<Gather> selectimgAll(Map map) {
        return dao.selectimgAll(map);
    }
}
