package com.iotek.dao;

import com.iotek.entity.Dept;
import com.iotek.entity.Job;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
public interface JobDao {

    List<Job> findAllJobs();

    List<Job> findByDeptId(int id);
}
