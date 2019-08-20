package com.wyj.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;



    @RequestMapping("/config")
    public String getConfig(){
        String str = "applicationName:" +applicationName+"\t eurekaServers"+eurekaServers;
        System.out.println("*********str:" +str);
        return str;
    }
}
