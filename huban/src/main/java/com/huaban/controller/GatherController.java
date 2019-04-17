package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Gather;
import com.huaban.service.IGatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return js;
    }
}
