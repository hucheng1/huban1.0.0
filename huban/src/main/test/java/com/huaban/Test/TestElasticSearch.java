package com.huaban.Test;

import com.huaban.dao.IUsersDao;
import com.huaban.entity.Users;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestElasticSearch {

    @Autowired
    IUsersDao usersDao;

    @Autowired
    JestClient jestClient;

    /**
     * 测试数据库往ES插入数据
     */
    @Test
    public void addUsersAllToES(){
        List<Users> list = usersDao.selectAll();
        for (Users users: list) {
            Index index = new Index.Builder(users).index("huaban").type("users").id(users.getUid().toString()).build();

            try {
                jestClient.execute(index);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Users数据执行完毕");
    }

    /**
     * 查找ES数据
     */
    @Test
    public void searchUsers(){
        String json = "\"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"last_uname\" : \"洪\"\n" +
                "        }\n" +
                "    }";

        Search search = new Search.Builder(json).addIndex("huaban").addType("users").build();

        try {
            JestResult execute = jestClient.execute(search);
            System.out.println(execute.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
