package com.dao;

import com.entity.Designer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDesigner {

            int pageCount(@Param("fgid") Integer fgid);//总页数

            List<Designer> toSelectAll(@Param("fdid") Integer fdid);//设计师

            List<Designer>selectAlld(@Param("fgid") Integer fgid, @Param("pageIndex")int pageIndex,@Param("pageSize")int pageSize);//查询全部
}
