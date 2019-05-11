package com.dao;

import com.entity.Categorize;
import com.entity.Services;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IService {

    List<Categorize> selectAllc();//查询全部父分类

    List<Services> selectSeAll();//查询全部

    Services selectSeall(@Param("fseid")Integer fseid);//设计服务详情

    String selectText(@Param("fseid")Integer fseid);//根据id查json数组

    int ByfesidCount( @Param("fdid")Integer fdid);//总计服务数
    List<Services> fesidCount(@Param("fdid")Integer fdid);

    List<Services> ByfdidSelect( @Param("fdid")Integer fdid);//设计师详情，按id查询服务

    /**
     * 查询总记录数
     */
    int findTotalPage(@Param("fcid") Integer fcid, @Param("fsid") Integer fsid);//页面总数


    List<Services> seelctSon(@Param("fcid") Integer fcid, @Param("fsid") Integer fsid,@Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);//高級查詢


    //查询购买单个具体信息
    Services selectServiceMpper(Integer fsId);
}
