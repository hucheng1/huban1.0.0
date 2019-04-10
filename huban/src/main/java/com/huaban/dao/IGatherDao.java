package com.huaban.dao;

import com.huaban.entity.Gather;

import java.util.List;
import java.util.Map;

public interface IGatherDao {

       //查询所有图片
   List<Gather> selectimgAll(Map map);
}
