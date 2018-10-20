package com.iotek.service.impl;

import com.iotek.dao.PunchDao;
import com.iotek.entity.Punch;
import com.iotek.service.PunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
@Service("punchService")
public class PunchServiceImpl implements PunchService {
    @Autowired
    private PunchDao punchDao;

    @Override
    public void addPunch(Punch punch) {
        punchDao.addPunch(punch);
    }

    @Override
    public Punch findPunchByUIdAndYearAndMonthAndDay(Integer id, int year, int month, int day) {
        return punchDao.findPunchByUIdAndYearAndMonthAndDay(id,year,month,day);
    }

    @Override
    public void updatePunch(Punch punch) {
        punchDao.updatePunch(punch);
    }
}
