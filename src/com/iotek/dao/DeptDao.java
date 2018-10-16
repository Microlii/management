package com.iotek.dao;

import com.iotek.entity.Dept;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
public interface DeptDao {

    List<Dept> findAllDept();


    Dept findDeptByName(String dept);
}
