package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Comment;
import com.huaban.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CommentController {
    @Autowired
    private ICommentService service;

    public ICommentService getService() {
        return service;
    }

    public void setService(ICommentService service) {
        this.service = service;
    }

    @RequestMapping("/findComments")
    @ResponseBody
    public String findComments(Integer pageNo,Integer gid){
        String js = "";
        //显示多少行数
        int pageSize = 10;
        Map map = new HashMap();
        map.put("pageNo",(pageNo-1)*pageSize);
        map.put("pageSize",pageSize);
        map.put("gid",gid);
        List<Comment> comments = service.selectBygid(map);
        js = JSON.toJSONString(comments);
        return js;
    }

    @RequestMapping("/addComment")
    @ResponseBody
    public String addComment(Comment comment){
        String js = "";
        Integer count = service.insertComment(comment);
        if(count>0){
            js = "true";
        }else{
            js = "false";
        }
        return js;
    }
}
