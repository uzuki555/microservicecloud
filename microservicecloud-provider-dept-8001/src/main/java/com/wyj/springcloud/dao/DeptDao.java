package com.wyj.springcloud.dao;

import com.wyj.springcloud.entities.Dept;

import java.util.List;

//@Mapper
public interface DeptDao {

    public  boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
