package com.huaban.service;

import com.huaban.entity.Class;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IClassService {

    /**
     * 查询全部
     */
    List<Class> selectAll();

}
