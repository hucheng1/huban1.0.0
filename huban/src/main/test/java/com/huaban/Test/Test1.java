package com.huaban.Test;
import com.huaban.entity.Class;
import com.huaban.service.IClassService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
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
}