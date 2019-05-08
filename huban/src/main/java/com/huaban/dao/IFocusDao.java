package com.huaban.dao;

import com.huaban.entity.Focus;

import java.util.List;

public interface IFocusDao {

    //查询画板关注者头像信息
    List<Focus> seelcthead_portrait(Integer id);
}
