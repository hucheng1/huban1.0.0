package com.dao;

import com.entity.Categorize;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ICategorize {

    List<Categorize> selectAllc();//查询全部父分类

}
