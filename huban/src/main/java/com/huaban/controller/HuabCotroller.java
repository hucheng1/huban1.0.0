package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Huab;
import com.huaban.service.IHuabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HuabCotroller {
    private IHuabService service;

    public IHuabService getService() {
        return service;
    }

    @Autowired
    public void setService(IHuabService service) {
        this.service = service;
    }

    @RequestMapping("/findHuab")
    @ResponseBody
    public String findHuab(Integer hid){
        System.out.println("进入方法");
        String js = "";
        Huab huab = service.selectByHid(hid);
        if(huab == null) return js;
        js = JSON.toJSONString(huab);
        return js;
    }

    //查询模块具体关注信息
    @RequestMapping(value="/ju",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String selectmode(Integer fid){
        System.out.println("进入画板查询------------");
        List<Huab> list=service.selectHuan(fid);
        String json=JSON.toJSONString(list);
        System.out.println("json："+json);
        return  json;
    }
}
