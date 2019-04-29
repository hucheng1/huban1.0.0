package com.huaban.service;

import com.huaban.dao.*;
import com.huaban.entity.*;
import java.util.*;

public interface ICommentService {

    /**
     *     根据采集id查询分页查询
     */
    List<Comment> selectBygid(Map map);

    /**
     * 添加讨论数据到数据库
     */
    Integer insertComment(Comment comment);

}
