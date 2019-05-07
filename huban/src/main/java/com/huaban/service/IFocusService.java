package com.huaban.service;

import com.huaban.entity.Focus;

import java.util.List;

public interface IFocusService {

    //查询画板关注者头像信息
    List<Focus> seelcthead_portrait(Integer id);
}
