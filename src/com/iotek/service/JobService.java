package com.iotek.service;

import com.iotek.entity.Job;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
public interface JobService {
     List<Job> findAllJobs();


    List<Job> findByDeptId(int id);
}
