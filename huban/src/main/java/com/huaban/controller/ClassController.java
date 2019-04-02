package com.huaban.controller;

import com.huaban.entity.Class;
import com.huaban.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClassController {

    @Autowired
    private IClassService service;

    //查询
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Class> findAllBranches(){
        System.out.println( service.selectAll());
        return service.selectAll();
    }
}
