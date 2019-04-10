package com.huaban.dao;

import com.huaban.entity.Huab;

public interface IHuabDao {

    /**
     * 根据hid查询画板类
     */
    Huab selectByHid(Integer hid);

}
