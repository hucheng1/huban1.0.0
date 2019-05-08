package com.huaban.Test;
import com.huaban.entity.Class;
import com.huaban.entity.Users;
import com.huaban.service.IClassService;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {

    @Autowired
    private IClassService cs;

    @Test
    public void findOne() throws Exception {
        List<Class> classes = cs.selectAll();
        System.out.println(classes);
    }

    @Autowired
    JestClient jestClient;

    @Test
    public void contextLoads() {
        Users users = new Users();
        users.setUid(1);
        users.setUname("小明");
        users.setSex(1);

        Index index = new Index.Builder(users).index("users").type("news").build();

        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}