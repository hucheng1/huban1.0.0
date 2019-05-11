package com.huaban.controller;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@CrossOrigin(origins = "http://localhost:8079")
@RequestMapping("/es/search")
public class ElasticSearchController {

    @Autowired
    JestClient jestClient;

    @RequestMapping(value = "/users")
    @ResponseBody
    public String searchUsers(String q,@RequestParam(required = false) Integer uid){
        System.out.print("搜索用户：");
        String query = "{\n" +
                "  \"query\": {\n" +
                "    \"match\": {\n" +
                (q!=null?"\"uname\":\""+q+"\"\n":"") +
                (uid!=null?"\"uid\":\""+uid+"\"":"")+
                "    }\n" +
                "  }\n" +
                "}";
//        System.out.println(query);
        Search search = new Search.Builder(query).addIndex("huaban").addType("users").build();
        JestResult execute=null;
        try {
            execute = jestClient.execute(search);
            System.out.println(execute.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return execute.getJsonString();
    }

    @RequestMapping(value = "/huab")
    @ResponseBody
    public String searchHuab(String q,Integer hid, Integer from, Integer size){
        System.out.println("from    ------    "+from);
        System.out.print("搜索画板：");
        String  query= "{ \n" +
                "\t\"query\": { \n" +
                "\t\t\"bool\": { \n" +
                "\t\t\t\"must\": [{ \n" +
                "\t\t\t\t\"match\": {\n" +
                (q!=null?"\"hname\":\""+q+"\"\n":"") +
                (hid!=null?"\"hid\":\""+hid+"\"\n":"") +
                "}\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"must_not\": [ ],\n" +
                "\t\t\t\"should\": [ ]\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"from\": "+from+",\n" +
                "\t\"size\": "+size+",\n" +
                "\t\"sort\": [ ],\n" +
                "\t\"aggs\": { }\n" +
                "}";
        System.out.println(query);
        Search search = new Search.Builder(query).addIndex("huaban_huab").addType("huab").build();
        JestResult execute=null;
        try {
            execute = jestClient.execute(search);
            System.out.println(execute.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return execute.getJsonString();
    }

    /**
     *
     * @param q 查询内容
     * @param from 开始数据
     * @param size 显示数据数
     * @param hid 画板id
     * @return 数据
     */
    @RequestMapping(value = "/gather")
    @ResponseBody
    public String searchGaher(String q,Integer from,Integer size,Integer hid){
        System.out.print("搜索采集：");
        String  query= "{ \n" +
                "\t\"query\": { \n" +
                "\t\t\"bool\": { \n" +
                "\t\t\t\"must\": [{ \n" +
                "\t\t\t\t\"match\": {" +
                (q!=null?"\"details\":\""+q+"\"\n":"") +
                (hid!=null?"\"hid\":\""+hid+"\"\n":"") +
                "}\n" +
                "\t\t\t}],\n" +
                "\t\t\t\"must_not\": [ ],\n" +
                "\t\t\t\"should\": [ ]\n" +
                "\t\t}\n" +
                "\t},\n" +
                "\t\"from\": "+from+",\n" +
                "\t\"size\": "+size+",\n" +
                "\t\"sort\": [ ],\n" +
                "\t\"aggs\": { }\n" +
                "}";
        Search search = new Search.Builder(query).addIndex("huaban_gather").addType("gather").build();
        JestResult execute=null;
        try {
            execute = jestClient.execute(search);
            System.out.println(execute.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return execute.getJsonString();
    }


}