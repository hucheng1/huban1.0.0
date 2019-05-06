package com.huaban.service.impl;

import com.huaban.dao.IGatherDao;
import com.huaban.dao.IHuabDao;
import com.huaban.entity.Huab;
import com.huaban.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 画板服务类
 */
@Transactional
@Service("huabService")
@MapperScan("com.huaban.dao")
public class HuabService implements IHuabService{

    private IHuabDao hdao;
    private IGatherDao gdao;

    public IHuabDao getHdao() {
        return hdao;
    }

    @Autowired
    public void setHdao(IHuabDao hdao) {
        this.hdao = hdao;
    }

    public IGatherDao getGdao() {
        return gdao;
    }
    @Autowired
    public void setGdao(IGatherDao gdao) {
        this.gdao = gdao;
    }

    public Huab selectByHid(Integer hid) {
        Huab huab =  hdao.selectByHid(hid);
        huab.setGathers(gdao.selectByHid(hid));
        return huab;
    }

    /**
     * 查询画板详情信息
     */
    @Override
    public List<Huab> selectHuan(int id) {
        return hdao.selectHuan(id);
    }
}
