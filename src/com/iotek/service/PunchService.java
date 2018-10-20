package com.iotek.service;

import com.iotek.entity.Punch;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
public interface PunchService {
    void addPunch(Punch punch);

    Punch findPunchByUIdAndYearAndMonthAndDay(Integer id, int year, int month, int day);

    void updatePunch(Punch punch);
}
