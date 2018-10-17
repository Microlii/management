package com.iotek.dao;

import com.iotek.entity.Interview;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/16 0016.
 */
public interface InterviewDao {
    void addInterview(Interview interview);

    Interview findInerrviewByUId(int i);

    List<Interview> findInterviewByHireAndInterview(@Param("hire") String hire, @Param("interview")String interview);

    void updateInterview(Interview interview);

    List<Interview> findInterviewsByHireAndInterviewAndDept(@Param("hire")String hire, @Param("interview")String interview, @Param("dept")String dept);
}
