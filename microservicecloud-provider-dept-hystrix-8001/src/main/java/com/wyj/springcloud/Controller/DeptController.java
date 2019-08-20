package com.wyj.springcloud.Controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wyj.springcloud.entities.Dept;
import com.wyj.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService service=null;



    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET )
    public Dept get(@PathVariable("id") Long id){
       Dept dept = this.service.get(id);
       if(null==dept){
           throw  new  RuntimeException("该id："+id+"没有没有对应的信息");

       }

       return dept;
    }
    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return  new Dept().setDeptno(id).setDname("该ID："+ id + "没有没有对应的信息，null -- @HystrixCommand").setDb_source("no this database in MySQL");
    }

}
