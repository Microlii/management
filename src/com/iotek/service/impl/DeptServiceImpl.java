package com.iotek.service.impl;

import com.iotek.dao.DeptDao;
import com.iotek.entity.Dept;
import com.iotek.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> findAllDept() {
        return deptDao.findAllDept();
    }

    @Override
    public Dept findDeptByName(String dept) {
        return deptDao.findDeptByName(dept);
    }


}
