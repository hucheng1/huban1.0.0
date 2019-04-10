package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Users;
import com.huaban.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersContoller {

    @Autowired
    private IUsersService service;

    public IUsersService getService() {
        return service;
    }

    public void setService(IUsersService service) {
        this.service = service;
    }

    @RequestMapping("findUsers")
    @ResponseBody
    public String findUsers(Integer uid){
        String js = "";
        Users users = service.selectByUid(uid);
        if(null==users) return js;
        js = JSON.toJSONString(users);
        return js;
    }
}
