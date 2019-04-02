package com.huaban.dao;

import com.huaban.entity.Class;

import java.util.List;

public interface IClassDao {

    /**
     * 查询全部
     */
    List<Class> selectAll();
}
