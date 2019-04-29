package com.huaban.service.impl;

import com.huaban.entity.Users;
import com.huaban.service.IClassService;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.Assert.*;

public class ClassServiceTest {

    @Autowired
    private IClassService cs;

    @Test
    public void selectAll() throws Exception {
        System.out.println( cs.selectAll());
    }



}