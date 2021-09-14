package com.islam.configserverclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

    @Autowired
    public DbSetting dbSetting;

    @Value("${my.greeting: Config Server is not working. Please check...}")
    private String greeting;

    @GetMapping("/hello")
    public String getMsg() {
        return greeting;
    }

    @GetMapping("/setting")
    public String getDBSetting() {
        return greeting + "*********" + dbSetting.getConnection() + " " + dbSetting.getHost() + " " + dbSetting.getPort();
    }
}
