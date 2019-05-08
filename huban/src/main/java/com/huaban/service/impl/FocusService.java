package com.huaban.service.impl;

import com.huaban.dao.IFocusDao;
import com.huaban.entity.Focus;
import com.huaban.service.IFocusService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service("focusService")
@MapperScan("com.huaban.dao")
public class FocusService implements IFocusService {

     @Autowired
     private IFocusDao fd;

    public IFocusDao getFd() {
        return fd;
    }

    public void setFd(IFocusDao fd) {
        this.fd = fd;
    }

    @Override
    public List<Focus> seelcthead_portrait(Integer id) {//查询关注者头像
        return fd.seelcthead_portrait(id);
    }
}
