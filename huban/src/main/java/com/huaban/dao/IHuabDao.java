package com.huaban.dao;

import com.huaban.entity.Huab;
import org.apache.ibatis.annotations.Param;

public interface IHuabDao {

    /**
     * 根据hid查询画板类
     */
    Huab selectByHid(@Param("hid") Integer hid);

}
