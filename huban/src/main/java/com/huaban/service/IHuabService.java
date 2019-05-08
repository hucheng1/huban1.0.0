package com.huaban.service;

import com.huaban.entity.Huab;

import java.util.List;

public interface IHuabService {
    /**
     * 根据hid查询画板类
     */
    Huab selectByHid(Integer hid);

    /**
     * 查询画板详情信息
     */
    List<Huab> selectHuan(int id);

}
