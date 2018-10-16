package com.iotek.service.impl;

import com.iotek.dao.JobDao;
import com.iotek.entity.Job;
import com.iotek.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13 0013.
 */
@Service("jobService")
public class JobServiceImpl implements JobService{
     @Autowired
     private JobDao jobDao;

     @Override
     public List<Job> findAllJobs() {
          return jobDao.findAllJobs();
     }

     @Override
     public List<Job> findByDeptId(int id) {
          return jobDao.findByDeptId(id);
     }
}
