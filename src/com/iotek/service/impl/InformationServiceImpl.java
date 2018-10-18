package com.iotek.service.impl;

import com.iotek.dao.InformationDao;
import com.iotek.entity.Information;
import com.iotek.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/17 0017.
 */
@Service("informationService")
public class InformationServiceImpl implements InformationService {
    @Autowired
    private InformationDao informationDao;

    @Override
    public Information findInformationById(Integer information) {
        return informationDao.findInformationById(information);
    }

    @Override
    public void addInformation(Information information) {
        informationDao.addInformation(information);
    }

    @Override
    public Information findInformationIformation(Information information) {
        return informationDao.findInformationIformation(information);
    }


}
