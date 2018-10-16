package com.iotek.service;

import com.iotek.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
public interface DeptService {

    List<Dept> findAllDept();


    Dept findDeptByName(String dept);
}
