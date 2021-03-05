package com.example.nacos.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope // 现配置自动更新
public class ConfigController {

    @Value("${phone}")
    private String msg;

    @Value("${username}")
    private String username;

    @RequestMapping("test")
    public void test(){
        System.out.println(this.msg);
        System.out.println(this.username);
    }

}
