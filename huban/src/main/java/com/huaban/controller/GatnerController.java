package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Class;
import com.huaban.entity.Gather;
import com.huaban.entity.Page;
import com.huaban.service.IGatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class GatnerController {
    @Autowired
    private IGatherService gs;

    public IGatherService getGs() {
        return gs;
    }

    public void setGs(IGatherService gs) {
        this.gs = gs;
    }

    //查询所有图片
    @RequestMapping(value="/img",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String findimgAll(String sum){
        System.out.println("进入查询为你推荐-----------------");
        Page page=new Page();
        //初始数据量
        page.setCurrentPage(0);//当前页
        page.setPageSize(8);//数据数量
        Map<Object,Integer> map=new HashMap<Object,Integer>();
        //获取是否点击了加载标识
        if(sum==null||sum==""){
            map.put("currentPage",page.getCurrentPage());//当前页
            map.put("pageSize",page.getPageSize());//数据数量
        }else{
            map.put("currentPage",page.getCurrentPage());//当前页
            map.put("pageSize",page.getPageSize()+8);//数据数量
        }
        List<Gather> list=gs.selectimgAll(map);
        System.out.println("list:"+list.size());
        String json= JSON.toJSONString(list);
        System.out.println("JSON："+json);
        return json;
    }

}
