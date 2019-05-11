package com.huaban.dao;

import com.huaban.entity.Huab;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IHuabDao {

    /**
     * 根据hid查询画板类
     */
    Huab selectByHid(@Param("hid") Integer hid);

    /**
     * 查询画板详情信息
     */
    List<Huab> selectHuan(@Param("hid") int hid);

    //查询所有信息
    List<Huab> selectAllImpl();

    //查询画板下的图片信息
    List<Huab> selectHuabAll();
}
