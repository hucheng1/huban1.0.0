package com.huaban.service.impl;

import com.huaban.dao.ICommentDao;
import com.huaban.entity.*;
import com.huaban.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Transactional
@MapperScan("com.huaban.dao")
@Service("commentService")
public class CommentService implements ICommentService{
    @Autowired
    private ICommentDao dao;

    public ICommentDao getDao() {
        return dao;
    }

    public void setDao(ICommentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Comment> selectBygid(Map map) {
        return dao.selectBygid(map);
    }

    @Override
    public Integer insertComment(Comment comment) {
        return dao.insertComment(comment);
    }
}
