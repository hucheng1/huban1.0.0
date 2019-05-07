package com.huaban.controller;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@CrossOrigin(origins = "http://localhost:8079")
@RequestMapping("/search")
public class ElasticSearchController {

    @Autowired
    JestClient jestClient;

    @RequestMapping(value = "/users")
    @ResponseBody
    public String searchUsers(String q){
        String json = "{\n" +
                "  \"query\": {\n" +
                "    \"match\": {\n" +
                "      \"uname\": \""+q+"\"\n" +
                "    }\n" +
                "  }\n" +
                "}";

        System.out.println("q   ----"+q);
        Search search = new Search.Builder(json).addIndex("huaban").addType("users").build();
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