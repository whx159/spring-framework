package com.whx.controller;

import com.whx.model.DistributeLock;
import com.whx.model.Lock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {

    @Autowired
    private Lock lock;

    @Autowired
    private DistributeLock distributeLock;

    @GetMapping("test01")
    public void test01(){
        System.out.println(distributeLock);
    }

}
