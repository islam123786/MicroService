package com.islam.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @Autowired
    private Environment env;

    @Autowired
    private Animal animal;

    @Autowired
    private DbSettings settings;

    @Value("${my.greeting: default Value}")
    private String greeting;

    @Value("Some Static Message")
    private String staticMessage;

    @Value("${color}")
    private List<String> colors;

    @Value("${dbValues: No Value Available}")
    private String dbValue;

    @Value("${db.connection}")
    private String dbConnection;

    @RequestMapping("/hello")
    public String greeting(){
        return greeting + " " + staticMessage + " " + colors + " " + dbValue + " " + settings.getConnection()
                + " " + settings.getHost() + " " + settings.getPort()+ " "+dbConnection+ " " + animal.speak();
    }

    @GetMapping("/envdetails")
    public String getEnv(){
        return env.toString();
    }
}
