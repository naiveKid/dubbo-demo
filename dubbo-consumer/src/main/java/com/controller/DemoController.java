package com.controller;

import com.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * 测试类
 */
@RestController
@RequestMapping("/")
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping("/{name}")
    public String test(@PathVariable String name){
        String username = name;
        return  demoService.changeUsername(username);
    }
}