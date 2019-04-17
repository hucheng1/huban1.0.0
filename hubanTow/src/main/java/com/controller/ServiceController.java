package com.controller;

//设计服务：子分类按父分类查 ，分页，数据库里添加数据

import com.alibaba.fastjson.JSON;
import com.entity.Categorize;
import com.service.SeriverImpl.AllServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class ServiceController {
    @Autowired
    private AllServiceImpl as;

    @RequestMapping("/CateSelctAll")
    @ResponseBody
    public String CateSelctAll(){
        System.out.print("----------进入父分类查询全部---------");
        List<Categorize> list=as.selectAllc();
        String json= JSON.toJSONString(list);
        return json;
    }


}
