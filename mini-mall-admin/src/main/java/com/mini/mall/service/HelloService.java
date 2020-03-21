package com.mini.mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author n-cz
 * @version HelloService.class, v 0.1 2020/3/20 22:26 n-cz Exp$
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name)
    {
        return restTemplate.getForObject("http://mini-mall-member/hi?name=" + name, String.class);
    }
}
