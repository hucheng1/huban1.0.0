package com.huaban.dao;

import com.huaban.entity.Comment;

import java.util.List;
import java.util.Map;

public interface ICommentDao {
    /**
     *  根据采集id查询分页查询
     */
    List<Comment> selectBygid(Map map);

    /**
     * 添加讨论数据到数据库
     */
    Integer insertComment(Comment comment);

}
