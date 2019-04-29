package com.huaban.service;

import com.huaban.entity.Gather;

import java.util.List;

public interface IGatherService {

    /**
     * 根据id查询采集类
     */
    Gather selectBygid(int gid);

    /**
     * 根据hid查询采集集合
     */
    List<Gather> selectByHid(Integer hid);
}
