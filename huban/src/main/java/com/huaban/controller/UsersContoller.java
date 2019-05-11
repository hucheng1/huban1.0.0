package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Users;
import com.huaban.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("/findUsers")
    @ResponseBody
    public String findUsers(Integer uid){
        String js = "";
        Users users = service.selectByUid(uid);
        if(null==users) return js;
        js = JSON.toJSONString(users);
        return js;
    }

    @RequestMapping(value="/login",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String login(Users user, HttpSession session){
        Users users = service.selectlogin(user);
        System.out.print("登录验证:"+users);
        boolean b ;
        if(users == null || users.getUid() == 0){
            b = false;
        }else{
            b = true;
            session.setAttribute("user",users);
        }
        return "{\"b\":"+b+"}";
    }

    @RequestMapping(value="/request",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String request(Users user){
        int num = service.insertUser(user);
        boolean b ;
        if(num>0){
            b = false;
        }else{
            b = true;
        }
        return "{\"b\":"+b+"}";
    }

    @RequestMapping(value="/requestYan",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String requestYan(String email){
        int num = service.selectReaquest(email);
        boolean b ;
        if(num>0){
            b = true;
        }else{
            b = false;
        }
        return "{\"b\":"+b+"}";
    }

    @RequestMapping(value="/user",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String user(HttpSession session){
      Users users = (Users)session.getAttribute("user");
      return JSON.toJSONString(users);
    }

    @RequestMapping("/update")
    public ModelAndView update(Users u,ModelAndView mv,HttpSession session){
        int num = service.updateUser(u);
        if(num>0) {
            Users users = service.selectByUid(u.getUid());
            //成功 重定向本页面
            session.setAttribute("user", users);
        }
        mv.setViewName("usersInfo.html");
        return mv;
    }
}
