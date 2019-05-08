package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Gather;
import com.huaban.service.IGatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class GatherController {

    private IGatherService service;

    public IGatherService getService() {
        return service;
    }

    @Autowired
    public void setService(IGatherService service) {
        this.service = service;
    }

    @RequestMapping("/gatherFind")
    @ResponseBody
    public String gatherFind(int gid){
        System.out.println("进入方法采集方法");
        String js = "";
        Gather gather = service.selectBygid(gid);
        if (gather == null) return js;
        js = JSON.toJSONString(gather);
        System.out.println("gather = "+js);
        return js;
    }
    //查询所有图片
    @RequestMapping(value="/img",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String findimgAll(Integer pageNo){
        System.out.println("进入查询为你推荐-----------------");
        int indexSize=8;
        Map<Object,Integer> map=new HashMap<Object,Integer>();
        map.put("currentPage",pageNo*indexSize);//当前页
        map.put("pageSize",indexSize);//数据数量
        List<Gather> list=service.selectimgAll(map);
        System.out.println("list:"+list.size());
        String json= JSON.toJSONString(list);
        System.out.println("JSON："+json);
        return json;

    }
}
