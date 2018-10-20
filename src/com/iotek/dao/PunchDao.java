package com.iotek.dao;

import com.iotek.entity.Punch;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
public interface PunchDao {
    void addPunch(Punch punch);

    Punch findPunchByUIdAndYearAndMonthAndDay(@Param("uId") Integer id,@Param("year") int year,@Param("month") int month,@Param("day")int day);

    void updatePunch(Punch punch);
}
