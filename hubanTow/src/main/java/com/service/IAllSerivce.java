package com.service;

import com.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IAllSerivce {

    List<Categorize> selectAllc();//查询全部父分类

    List<Services> selectSeAll();//查询全部

    List<Good>selectByDesid(Integer fdid);//按设计师表查fdid

    List<Designer> toSelectAll(@Param("fdid") Integer fdid);//设计师

    List<Services> ByfdidSelect( @Param("fdid")Integer fdid);//设计师详情，按id查询服务

    Services selectSeall(@Param("fseid")Integer fseid);//设计服务详情

    String selectText(@Param("fseid")Integer fseid);//根据id查json数组

    Designer toYuan(@Param("fdid") Integer fdid);//按设计详情表


    List<Good>selectGood();//查询全部设计师分类

    int ByfesidCount( @Param("fdid")Integer fdid);
    List<Services> fesidCount(@Param("fdid")Integer fdid);


    int pageCount(@Param("fgid") Integer fgid);//总页数

    List<Designer>selectAlld(@Param("fgid") Integer fgid, @Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);//查询全部

    /**
     * 查询总记录数
     */
    int findTotalPage(@Param("fcid") Integer fcid, @Param("fsid") Integer fsid);//页面总数


    List<Services> seelctSon(@Param("fcid") Integer fcid, @Param("fsid") Integer fsid ,int PageIndex,int Pagesize);//高級查詢

    //添加订单
    int insertOrder(Order order);

    //查询购买单个具体信息
    Services selectServiceMpper(Integer fsId);

}
