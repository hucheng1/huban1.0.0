package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Huab;
import com.huaban.service.IHuabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
