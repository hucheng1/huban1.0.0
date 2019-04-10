package com.huaban.dao;

import com.huaban.entity.Gather;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IGatherDao {

    /**
     * 根据id查询采集类
     */
    Gather selectBygid(@Param("gid") int gid);

    /**
     * 根据hid查询采集集合
     */
    List<Gather> selectByHid(Integer hid);
}
