package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Focus;
import com.huaban.service.IFocusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FocusController {

    @Autowired
    private IFocusService fs;

    public IFocusService getFs() {
        return fs;
    }

    public void setFs(IFocusService fs) {
        this.fs = fs;
    }

    //查询画板具体关注者头像信息
    @RequestMapping(value="/heder",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String selectmodes(Integer fid){
        System.out.println("进入关注者头像查询------------"+fid);
        List<Focus> list=fs.seelcthead_portrait(fid);
        String json= JSON.toJSONString(list);
        System.out.println("关注者头像信息："+json);
        return  json;
    }
}
