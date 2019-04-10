package com.huaban.service;

import com.huaban.entity.Huab;

public interface IHuabService {
    /**
     * 根据hid查询画板类
     */
    Huab selectByHid(Integer hid);
    
}
