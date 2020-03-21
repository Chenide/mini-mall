package com.mini.mall.controller;

import com.mini.mall.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author n-cz
 * @version HelloControler.class, v 0.1 2020/3/20 22:25 n-cz Exp$
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
