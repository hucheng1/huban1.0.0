package com.huaban.service;

import com.huaban.entity.Gather;

import java.util.List;
import java.util.Map;

public interface IGatherService {

    //查询所有图片
    List<Gather> selectimgAll(Map map);
}
