package com.huaban.controller;

import com.alibaba.fastjson.JSON;
import com.huaban.entity.Gather;
import com.huaban.entity.Huab;
import com.huaban.service.IGatherService;
import com.huaban.service.IHuabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://127.0.0.1:8020")
@Controller
public class GatherController {

    private IGatherService service;
    private IHuabService hs;

    public IHuabService getHs() {
        return hs;
    }

    @Autowired
    public void setHs(IHuabService hs) {
        this.hs = hs;
    }

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
        System.out.println("gather = "+js);
        return js;
    }

    //查询所有图片
    @RequestMapping(value="/img",produces={"application/json;charset=UTF-8"})
    @ResponseBody
    public String findimgAll(Integer pageNo){
        System.out.println("进入查询为你推荐-----------------");
        int indexSize=8;
        Map<Object,Integer> map=new HashMap<Object,Integer>();
        map.put("currentPage",pageNo*indexSize);//当前页
        map.put("pageSize",indexSize);//数据数量
        List<Gather> list=service.selectimgAll(map);
        System.out.println("list:"+list.size());
        String json= JSON.toJSONString(list);
        System.out.println("JSON："+json);
        return json;

    }

    //查询模块具体关注信息
    @RequestMapping(value = "/hong", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String selectImpl() {
        System.out.println("进入画板分批查询------------");
        List<Huab> huab = hs.selectAllImpl();
        for (Huab hb : huab) {
            List<Gather> list = service.selectById(hb.getHid());
            hb.setGathers(list);
        }
        String json = JSON.toJSONString(huab);
        System.out.println("vue数据：" + json);
        return json;
    }

    //查询模块具体关注信息
    @RequestMapping(value = "/gathers", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String selectAllHuan(Integer hid) {
        System.out.println("进入画板所有图片查询------------");
        List<Gather> list = service.selectHubanAll(hid);
        String json = JSON.toJSONString(list);
        System.out.println("数据：" + json);
        return json;
    }

    //查询首页为你推荐
    @RequestMapping(value = "/tuijians", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String select() {
        System.out.println("进入首页推荐查询------------");
        List<Gather> list = service.selectTuiJian();
        String json = JSON.toJSONString(list);
        System.out.println("数据：" + json);
        return json;
    }
}
