package com.huaban.dao;

import com.huaban.entity.Gather;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IGatherDao {

       //查询所有图片
   List<Gather> selectimgAll(Map map);

    /**
     * 根据id查询采集类
     */
    Gather selectBygid(@Param("gid") int gid);

    /**
     * 根据hid查询采集集合
     */
    List<Gather> selectByHid(@Param("hid") Integer hid);


 //查询画板关注详情信息
 List<Gather> selectHubanAll(int hid);

 //查询画板信息
 List<Gather> selectById(Integer hid);


 //查询首页为你推荐
 List<Gather> selectTuiJian();
}
