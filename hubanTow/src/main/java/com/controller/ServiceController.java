package com.controller;

//设计服务：子分类按父分类查 ，分页，数据库里添加数据

import com.alibaba.fastjson.JSON;
import com.entity.*;
import com.entity.Page;
import com.service.IAllSerivce;
import com.service.SeriverImpl.AllServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

@Controller
public class ServiceController {
    @Autowired
    private IAllSerivce as;

    @RequestMapping("/CateSelctAll")
    @ResponseBody
    public String CateSelctAll(){
        System.out.println("----------进入父分类查询全部---------");
        List<Categorize> list=as.selectAllc();
        String json= JSON.toJSONString(list);
        return json;
    }


    @RequestMapping(value = "/selectCGao")
    @ResponseBody
    public String selectSon(Integer fcid, Integer fsid, Integer pageNo){
        System.out.println("--------进入父分类和子分类的高级查询---------------");
         System.out.println("pageNo="+pageNo);
        if(pageNo==null||pageNo.equals("")){//第一次进入页面
            pageNo=1;
        }
        int pageSize=8;
        int count=as.findTotalPage(fcid,fsid);
        System.out.println("count"+count);
        int totoalPage=count%pageSize==0?count/pageSize:count/pageSize+1;

        //初始化page
        Page page=new Page();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setTotalCount(count);
        page.setTotalPage(totoalPage);

        int pageIndex=(pageNo-1)*pageSize;//求当前页面
        System.out.println("pageIndex"+pageIndex);
        List<Services> list=as.seelctSon(fcid,fsid,pageIndex,pageSize);//高级查询
        PageService ps=new PageService();
        ps.setPage(page);//赋值page
        ps.setSer(list);//赋值Services    list
        String json= JSON.toJSONString(ps);//发json
        System.out.println("json======"+json);
        return json ;
    }

    @RequestMapping(value="/selectSeAll")
    @ResponseBody
    public String selectSeAll(){
        System.out.println("---------进入服务表查询全部------------");
        List<Services>list=as.selectSeAll();
        String json=JSON.toJSONString(list);
        System.out.println("服务表查询全部"+json);
        return json;
    }

    @RequestMapping(value = "/selectGood")
    @ResponseBody
    public String selectGood(){
        System.out.println("-----------进入设计师分类查询全部-------------------");
        List<Good>list=as.selectGood();
        String json=JSON.toJSONString(list);
        System.out.println("设计师分类查询全部"+json);
        return json;
    }

    @RequestMapping(value = "/selectAlld")
    @ResponseBody
    public String selectAlld(@RequestParam(value = "fgid",required = false) Integer fgid,@RequestParam(value = "pageNo",required = false) Integer pageNo){
        System.out.println("------------进入设计师查询全部----------------");
        System.out.println("pageNo1="+pageNo);
        if(pageNo==null||pageNo.equals("")){//第一次进入页面
            pageNo=1;
        }
        System.out.println("pageNo2="+pageNo);
        int pageSize=8;
        int count=as.pageCount(fgid);
        System.out.println("count"+count);
        int totoalPage=count%pageSize==0?count/pageSize:count/pageSize+1;

        //初始化page
        Page page=new Page();
        page.setPageNo(pageNo);
        page.setPageSize(pageSize);
        page.setTotalCount(count);
        page.setTotalPage(totoalPage);

        int pageIndex=(pageNo-1)*pageSize;//求当前页面
        System.out.println("pageIndex"+pageIndex);
        List<Designer> list=as.selectAlld(fgid,pageIndex,pageSize);
        List<Good>good=as.selectGood();

        PageService ps=new PageService();
        ps.setPage(page);
        ps.setDes(list);
        ps.setGood(good);
        System.out.println( ps.getDes().size());

        String json=JSON.toJSONString(ps);
        System.out.println("json="+json);
        return json;

    }
    @RequestMapping(value = "/toSelectAll")
    @ResponseBody
    public String toSelectAll(Integer fdid){
        System.out.println("------进入设计师详情------------");
        System.out.println("fdid="+fdid);
        List<Designer>list=as.toSelectAll(fdid);
       String json=JSON.toJSONString(list);
        System.out.println("json="+json);
        return json;
    }

    @RequestMapping(value = "ByfdidSelect")
    @ResponseBody
    public String ByfdidSelect(Integer fdid){
        System.out.println("--------进入设计师详情查询服务-----------");
        System.out.println("fdid="+fdid);
        List<Services> ser=as.ByfdidSelect(fdid);
        String json=JSON.toJSONString(ser);
        System.out.println("json="+json);
        return json;
    }

    @RequestMapping(value = "/selectSeall")
    @ResponseBody
    public String  selectSeall(Integer fseid){
        System.out.println("--------进入设计服务详情------------");
        System.out.println("fseid="+fseid);
        Services se=as.selectSeall(fseid);
        Designer des=as.toYuan(se.getFdId());
        se.setDes(des);
        String json =JSON.toJSONString(se);
        System.out.println("json="+json);
        return  json;
    }

    @RequestMapping(value = "/selectText")
    @ResponseBody
    public String  selectText(Integer fseid){
        System.out.println("--------进入设计服务详情json------------");
        System.out.println("fseid="+fseid);
        String ser=as.selectText(fseid);
        System.out.println("------ser-----"+ser);
        return  ser;
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(Integer uid,String uname){//登录的方法
        return "uname";
    }












}
