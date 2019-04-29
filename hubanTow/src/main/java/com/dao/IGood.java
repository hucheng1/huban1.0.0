package com.dao;

import com.entity.Good;

import java.util.List;

public interface IGood {

    List<Good>selectGood();//查询全部设计师分类


    List<Good>selectByDesid(Integer fdid);//按设计师表查fdid

}
