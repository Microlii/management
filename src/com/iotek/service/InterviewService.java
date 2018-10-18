package com.iotek.service;

import com.iotek.entity.Interview;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
public interface InterviewService {

    void addInterview(Interview interview);

    Interview findInterviewByUId(int id);

    void updateInterview(Interview interview);

    List<Interview> findInterviewsByHireAndInterview(String hire, String interview);

    List<Interview> findInterviewsByHireAndInterviewAndDept(String hire, String interview, String dept);

    Interview findInterviewByRId(Integer id);

    void deleteByRid(Integer id);
}
