package com.iotek.service.impl;

import com.iotek.dao.InterviewDao;
import com.iotek.entity.Interview;
import com.iotek.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
@Service("interviewService")
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewDao interviewDao;
    @Override
    public void addInterview(Interview interview) {
        interviewDao.addInterview(interview);
    }

    @Override
    public Interview findInterviewByUId(int id) {
        return interviewDao.findInerrviewByUId(id);
    }

    @Override
    public void updateInterview(Interview interview) {
        interviewDao.updateInterview(interview);
    }

    @Override
    public List<Interview> findInterviewsByHireAndInterview(String hire, String interview) {
        return interviewDao.findInterviewByHireAndInterview(hire,interview);
    }

    @Override
    public List<Interview> findInterviewsByHireAndInterviewAndDept(String hire, String interview, String dept) {
        return interviewDao.findInterviewsByHireAndInterviewAndDept(hire,interview,dept);
    }

    @Override
    public Interview findInterviewByRId(Integer id) {
        return interviewDao.findInterviewByRId(id);
    }

    @Override
    public void deleteByRid(Integer id) {
        interviewDao.deleteByRid(id);
    }
}
