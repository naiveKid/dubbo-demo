package com.controller;

import com.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * 测试类
 */
@RestController
@RequestMapping("/consumer")
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/test")
    public String test(){
        String username = "lisi";
        return  demoService.changeUsername(username);
    }
}