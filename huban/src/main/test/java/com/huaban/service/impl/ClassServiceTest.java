package com.huaban.service.impl;

import com.huaban.service.IClassService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ClassServiceTest {

    @Autowired
    private IClassService cs;

    @Test
    public void selectAll() throws Exception {
        System.out.println( cs.selectAll());
    }

}