package com.wyj.springcloud.Controller;

import com.wyj.springcloud.entities.Dept;
import com.wyj.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {

//    private static final String REST_URL_PREFIX="http://localhost:8001";

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/Consumer/dept/add")
    public Object add(Dept dept){
        return this.service.add(dept);
    }
    @RequestMapping(value ="/Consumer/dept/get/{id}" )
    public Dept get(@PathVariable("id") Long id){
        return this.service.get(id);
    }
    @RequestMapping(value ="/Consumer/dept/list" )
    public List<Dept> list(){
        return this.service.list();
    }


}
